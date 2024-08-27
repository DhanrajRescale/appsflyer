package okhttp3.internal.ws;

import bv.h;
import bv.j;
import bv.k;
import bv.m;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", HttpUrl.FRAGMENT_ENCODE_SET, "opcode", "Lbv/m;", PaymentConstants.PAYLOAD, HttpUrl.FRAGMENT_ENCODE_SET, "writeControlFrame", "writePing", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", HttpUrl.FRAGMENT_ENCODE_SET, "isClient", "Z", "Lbv/k;", "sink", "Lbv/k;", "getSink", "()Lbv/k;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", HttpUrl.FRAGMENT_ENCODE_SET, "minimumDeflateSize", "J", "Lbv/j;", "messageBuffer", "Lbv/j;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", HttpUrl.FRAGMENT_ENCODE_SET, "maskKey", "[B", "Lbv/h;", "maskCursor", "Lbv/h;", "<init>", "(ZLbv/k;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final h maskCursor;
    private final byte[] maskKey;

    @NotNull
    private final j messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @NotNull
    private final Random random;

    @NotNull
    private final k sink;

    @NotNull
    private final j sinkBuffer;
    private boolean writerClosed;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, bv.j] */
    public WebSocketWriter(boolean z10, @NotNull k sink, @NotNull Random random, boolean z11, boolean z12, long j10) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.isClient = z10;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new Object();
        this.sinkBuffer = sink.h();
        if (z10) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z10 ? new h() : null;
    }

    private final void writeControlFrame(int opcode, m payload) throws IOException {
        if (!this.writerClosed) {
            int d10 = payload.d();
            if (d10 <= 125) {
                this.sinkBuffer.b0(opcode | 128);
                if (this.isClient) {
                    this.sinkBuffer.b0(d10 | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    Intrinsics.c(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.U(this.maskKey);
                    if (d10 > 0) {
                        j jVar = this.sinkBuffer;
                        long j10 = jVar.f7365b;
                        jVar.S(payload);
                        j jVar2 = this.sinkBuffer;
                        h hVar = this.maskCursor;
                        Intrinsics.c(hVar);
                        jVar2.n(hVar);
                        this.maskCursor.b(j10);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.b0(d10);
                    this.sinkBuffer.S(payload);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @NotNull
    public final Random getRandom() {
        return this.random;
    }

    @NotNull
    public final k getSink() {
        return this.sink;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, bv.j] */
    public final void writeClose(int code, m reason) throws IOException {
        m mVar = m.f7367d;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            ?? obj = new Object();
            obj.g0(code);
            if (reason != null) {
                obj.S(reason);
            }
            mVar = obj.e(obj.f7365b);
        }
        try {
            writeControlFrame(8, mVar);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, @NotNull m data) throws IOException {
        int i10;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.writerClosed) {
            this.messageBuffer.S(data);
            int i11 = formatOpcode | 128;
            if (this.perMessageDeflate && data.d() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i11 = formatOpcode | 192;
            }
            long j10 = this.messageBuffer.f7365b;
            this.sinkBuffer.b0(i11);
            if (this.isClient) {
                i10 = 128;
            } else {
                i10 = 0;
            }
            if (j10 <= 125) {
                this.sinkBuffer.b0(i10 | ((int) j10));
            } else if (j10 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.b0(i10 | 126);
                this.sinkBuffer.g0((int) j10);
            } else {
                this.sinkBuffer.b0(i10 | 127);
                this.sinkBuffer.f0(j10);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                Intrinsics.c(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.U(this.maskKey);
                if (j10 > 0) {
                    j jVar = this.messageBuffer;
                    h hVar = this.maskCursor;
                    Intrinsics.c(hVar);
                    jVar.n(hVar);
                    this.maskCursor.b(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, j10);
            this.sink.i();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(@NotNull m payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(@NotNull m payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(10, payload);
    }
}
