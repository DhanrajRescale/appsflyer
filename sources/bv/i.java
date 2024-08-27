package bv;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f7363b;

    public /* synthetic */ i(l lVar, int i10) {
        this.f7362a = i10;
        this.f7363b = lVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i10 = this.f7362a;
        l lVar = this.f7363b;
        switch (i10) {
            case 0:
                return (int) Math.min(((j) lVar).f7365b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            default:
                e0 e0Var = (e0) lVar;
                if (!e0Var.f7342c) {
                    return (int) Math.min(e0Var.f7341b.f7365b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7362a) {
            case 0:
                return;
            default:
                ((e0) this.f7363b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i10, int i11) {
        int i12 = this.f7362a;
        l lVar = this.f7363b;
        switch (i12) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                return ((j) lVar).read(sink, i10, i11);
            default:
                Intrinsics.checkNotNullParameter(sink, "data");
                e0 e0Var = (e0) lVar;
                if (!e0Var.f7342c) {
                    b.b(sink.length, i10, i11);
                    j jVar = e0Var.f7341b;
                    if (jVar.f7365b == 0 && e0Var.f7340a.read(jVar, 8192L) == -1) {
                        return -1;
                    }
                    return jVar.read(sink, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i10 = this.f7362a;
        l lVar = this.f7363b;
        switch (i10) {
            case 0:
                return ((j) lVar) + ".inputStream()";
            default:
                return ((e0) lVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f7362a;
        l lVar = this.f7363b;
        switch (i10) {
            case 0:
                j jVar = (j) lVar;
                if (jVar.f7365b > 0) {
                    return jVar.readByte() & 255;
                }
                return -1;
            default:
                e0 e0Var = (e0) lVar;
                if (!e0Var.f7342c) {
                    j jVar2 = e0Var.f7341b;
                    if (jVar2.f7365b == 0 && e0Var.f7340a.read(jVar2, 8192L) == -1) {
                        return -1;
                    }
                    return jVar2.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }
}
