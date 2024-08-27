package g6;

import al.d;
import b5.m;
import b5.q0;
import e5.p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kp.e;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16639b;

    public b(int i10) {
        this.f16639b = i10;
    }

    @Override // al.d
    public final q0 d0(f6.a aVar, ByteBuffer byteBuffer) {
        switch (this.f16639b) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                m mVar = new m(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                mVar.s(12);
                int f10 = (mVar.f() + mVar.i(12)) - 4;
                mVar.s(44);
                mVar.t(mVar.i(12));
                mVar.s(16);
                ArrayList arrayList = new ArrayList();
                while (mVar.f() < f10) {
                    mVar.s(48);
                    int i11 = mVar.i(8);
                    mVar.s(4);
                    int f11 = mVar.f() + mVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (mVar.f() < f11) {
                        int i12 = mVar.i(8);
                        int i13 = mVar.i(8);
                        int f12 = mVar.f() + i13;
                        if (i12 == 2) {
                            int i14 = mVar.i(16);
                            mVar.s(8);
                            if (i14 == 3) {
                                while (mVar.f() < f12) {
                                    int i15 = mVar.i(8);
                                    Charset charset = e.f23431a;
                                    byte[] bArr = new byte[i15];
                                    mVar.k(bArr, i15);
                                    String str3 = new String(bArr, charset);
                                    int i16 = mVar.i(8);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        mVar.t(mVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i12 == 21) {
                            Charset charset2 = e.f23431a;
                            byte[] bArr2 = new byte[i13];
                            mVar.k(bArr2, i13);
                            str2 = new String(bArr2, charset2);
                        }
                        mVar.p(f12 * 8);
                    }
                    mVar.p(f11 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i11, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new q0(arrayList);
            default:
                p pVar = new p(byteBuffer.array(), byteBuffer.limit());
                String p10 = pVar.p();
                p10.getClass();
                String p11 = pVar.p();
                p11.getClass();
                return new q0(new h6.a(p10, p11, pVar.o(), pVar.o(), Arrays.copyOfRange(pVar.f15036a, pVar.f15037b, pVar.f15038c)));
        }
    }
}
