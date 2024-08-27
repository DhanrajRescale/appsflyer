package okhttp3.internal.ws;

import bv.b;
import bv.h;
import bv.j;
import bv.m;
import bv.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import yk.g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lbv/j;", "Lbv/m;", "suffix", HttpUrl.FRAGMENT_ENCODE_SET, "endsWith", "buffer", HttpUrl.FRAGMENT_ENCODE_SET, "deflate", "close", "noContextTakeover", "Z", "deflatedBytes", "Lbv/j;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lbv/n;", "deflaterSink", "Lbv/n;", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {

    @NotNull
    private final j deflatedBytes;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final n deflaterSink;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, bv.j] */
    public MessageDeflater(boolean z10) {
        this.noContextTakeover = z10;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new n(obj, deflater);
    }

    private final boolean endsWith(j jVar, m mVar) {
        return jVar.T(jVar.f7365b - mVar.d(), mVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull j buffer) throws IOException {
        m mVar;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.deflatedBytes.f7365b == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.f7365b);
            this.deflaterSink.flush();
            j jVar = this.deflatedBytes;
            mVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(jVar, mVar)) {
                j jVar2 = this.deflatedBytes;
                long j10 = jVar2.f7365b - 4;
                h n10 = jVar2.n(b.f7322a);
                try {
                    n10.a(j10);
                    g.k(n10, null);
                } finally {
                }
            } else {
                this.deflatedBytes.b0(0);
            }
            j jVar3 = this.deflatedBytes;
            buffer.write(jVar3, jVar3.f7365b);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
