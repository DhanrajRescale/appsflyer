package k5;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import lp.v0;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r0v0, types: [lp.t0, lp.h0] */
    private static final v0 a() {
        ?? h0Var = new lp.h0();
        Integer[] numArr = {8, 7};
        lp.g0.a(2, numArr);
        h0Var.d0(h0Var.f24989c + 2);
        System.arraycopy(numArr, 0, h0Var.f24988b, h0Var.f24989c, 2);
        h0Var.f24989c += 2;
        int i10 = e5.x.f15050a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            lp.g0.a(2, numArr2);
            h0Var.d0(h0Var.f24989c + 2);
            System.arraycopy(numArr2, 0, h0Var.f24988b, h0Var.f24989c, 2);
            h0Var.f24989c += 2;
        }
        if (i10 >= 33) {
            h0Var.e0(30);
        }
        return h0Var.f0();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        v0 a10 = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a10.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
