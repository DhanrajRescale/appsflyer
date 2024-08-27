package ck;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f8201a;

    /* renamed from: b, reason: collision with root package name */
    public int f8202b;

    /* renamed from: c, reason: collision with root package name */
    public int f8203c;

    public i(h hVar) {
        Context context = hVar.f8197a;
        ActivityManager activityManager = hVar.f8198b;
        int i10 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f8203c = i10;
        int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) hVar.f8199c.f35633b;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = hVar.f8200d;
        int round2 = Math.round(f10 * f11);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f8202b = round3;
            this.f8201a = round2;
        } else {
            float f12 = i11 / (f11 + 2.0f);
            this.f8202b = Math.round(2.0f * f12);
            this.f8201a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f8202b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.f8201a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > round);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, round));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    public i(int i10, int i11, int i12) {
        this.f8201a = i10;
        this.f8202b = i11;
        this.f8203c = i12;
    }
}
