package vn;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public abstract class b implements TypeEvaluator {
    public static Integer a(float f10, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f12 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float b10 = nn.d.b(f12, f11, f10, f11);
        float b11 = nn.d.b(pow4, pow, f10, pow);
        float b12 = nn.d.b(pow5, pow2, f10, pow2);
        float b13 = nn.d.b(pow6, pow3, f10, pow3);
        float pow7 = ((float) Math.pow(b11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(b12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(b13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(b10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
