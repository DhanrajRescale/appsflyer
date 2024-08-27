package bv;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface l extends k0, ReadableByteChannel {
    String B(Charset charset);

    m E();

    boolean F(long j10);

    void G(j jVar, long j10);

    String K();

    int L();

    int M(a0 a0Var);

    short O();

    long P(m mVar);

    long Q();

    boolean T(long j10, m mVar);

    long V(k kVar);

    void W(long j10);

    long Z();

    i a0();

    m e(long j10);

    j h();

    byte[] o();

    boolean p();

    e0 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    long u();

    String w(long j10);
}
