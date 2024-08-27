package q8;

import bv.i0;
import bv.r;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import o8.z;

/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f31861a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31862b;

    public i(i0 i0Var, z zVar) {
        super(i0Var);
        this.f31861a = zVar;
    }

    @Override // bv.r, bv.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f31862b = true;
            this.f31861a.invoke(e10);
        }
    }

    @Override // bv.r, bv.i0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f31862b = true;
            this.f31861a.invoke(e10);
        }
    }

    @Override // bv.r, bv.i0
    public final void write(bv.j jVar, long j10) {
        if (this.f31862b) {
            jVar.skip(j10);
            return;
        }
        try {
            super.write(jVar, j10);
        } catch (IOException e10) {
            this.f31862b = true;
            this.f31861a.invoke(e10);
        }
    }
}
