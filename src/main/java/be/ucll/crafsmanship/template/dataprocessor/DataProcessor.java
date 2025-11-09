package be.ucll.crafsmanship.template.dataprocessor;

public abstract class DataProcessor {
    public final void process() {
        load();
        transform();
        save();
    }

    protected abstract void load();
    protected abstract void transform();
    protected abstract void save();
}
