package bv;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface k extends i0, WritableByteChannel {
    k C(byte[] bArr, int i10, int i11);

    k D(long j10);

    k N(byte[] bArr);

    k Y(long j10);

    @Override // bv.i0, java.io.Flushable
    void flush();

    j h();

    k i();

    k k(int i10);

    k m(int i10);

    k q(m mVar);

    k r(int i10);

    long s(k0 k0Var);

    k t();

    k y(String str);
}
