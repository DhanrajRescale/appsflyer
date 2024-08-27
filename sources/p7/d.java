package p7;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface d extends Closeable {
    a A();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
