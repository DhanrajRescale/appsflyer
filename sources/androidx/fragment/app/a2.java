package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class a2 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f1591b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f1590a = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.f1591b;
        if (sb2.length() > 0) {
            Log.d(this.f1590a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f1591b.append(c10);
            }
        }
    }
}
