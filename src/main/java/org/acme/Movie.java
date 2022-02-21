package org.acme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Schema(name = "Movie", description = "Movie representation")
public class Movie {
    private Long id;
    @Schema(required = true)
    private String title;

}
