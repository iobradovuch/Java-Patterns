package ua.iobradovuch.lab1.abstractFactory;

public class IceArtifactFactory implements ArtifactFactory {
    @Override
    public Artifact createArtifact() {
        return new Artifact("Frost Crystal", "Freezes enemies");
    }
}
