package ua.iobradovuch.abstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public interface ArtifactFactory {
    Artifact createArtifact();
}

