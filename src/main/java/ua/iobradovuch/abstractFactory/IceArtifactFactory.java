package ua.iobradovuch.abstractFactory;

public class IceArtifactFactory implements ArtifactFactory {
    @Override
    public Artifact createArtifact() {
        return new Artifact("Frost Crystal", "Freezes enemies");
    }
}
