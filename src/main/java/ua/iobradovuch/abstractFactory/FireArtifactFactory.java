package ua.iobradovuch.abstractFactory;

public class FireArtifactFactory implements ArtifactFactory {
    @Override
    public Artifact createArtifact() {
        return new Artifact("Flame Orb", "Burns enemies");
    }
}
