package edu.tcu.cs.hogwartsartifactsonline.wizard.dto;

import jakarta.validation.constraints.NotBlank;

public record WizardDto(Integer id,

                        @NotBlank(message = "name is required.")
                        String name,
                        Integer numberOfArtifacts) {
}
