package vk;

import android.util.Log;
import ek.h0;
import java.security.SecureRandom;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c {
    static {
        new SecureRandom();
    }

    public static byte[] a(e eVar) {
        byte[] bArr;
        int i10 = eVar.f38159b;
        byte[] bArr2 = new byte[i10];
        if (eVar.f38158a == b.f38153i) {
            h0 h0Var = new h0(3);
            byte[] bArr3 = (byte[]) h0Var.f15593b;
            bArr3[0] = zq.f.h0(bArr3[0], 5);
            byte[] bArr4 = (byte[]) h0Var.f15593b;
            bArr4[0] = zq.f.h0(bArr4[0], 3);
            byte[] bArr5 = (byte[]) h0Var.f15593b;
            bArr = Arrays.copyOf(bArr5, bArr5.length);
        } else {
            bArr = null;
        }
        Log.d("Deepak Sharma ", zq.f.A(bArr));
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
        }
        return bArr2;
    }
}
