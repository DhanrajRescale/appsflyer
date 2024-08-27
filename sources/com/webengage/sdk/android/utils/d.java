package com.webengage.sdk.android.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.webengage.sdk.android.Logger;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public class d {
    public static int a(int i10, int i11, int i12) {
        int i13 = i11 * i12 * 4;
        Logger.d("WebEngage", "Bitmap calculated size " + i13);
        int i14 = 1;
        while (i10 < i13) {
            i14 *= 2;
            i13 /= 4;
        }
        Logger.d("WebEngage", "Bitmap Size set to " + i13);
        Logger.d("WebEngage", "Bitmap sampleSize set to " + i14);
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<android.graphics.Bitmap> b(java.util.List<android.graphics.Bitmap> r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.d.b(java.util.List, int, int):java.util.List");
    }

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getByteCount();
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            if (bitmap.getByteCount() >= i10) {
                Logger.d("WebEngage", "Bitmap size exceeds RemoteView limit");
                Logger.d("WebEngage", "Bitmap size " + bitmap.getByteCount());
                Logger.d("WebEngage", "Bitmap maxSizePossible " + i10);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                options.inSampleSize = a(i10, options.outHeight, options.outWidth);
                options.inJustDecodeBounds = false;
                return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            }
            Logger.d("WebEngage", "Returning image without modification");
        }
        return bitmap;
    }

    public static List<Bitmap> a(List<Bitmap> list, int i10, int i11) {
        int a10;
        int i12;
        int i13 = (int) (i10 * 0.4f);
        Bitmap bitmap = list.get(1);
        if (a(bitmap) <= i13) {
            a10 = a(bitmap);
        } else {
            Bitmap a11 = a(bitmap, i13);
            list.set(1, a11);
            a10 = a(a11);
        }
        int i14 = (i10 - a10) / (i11 - 1);
        for (int i15 = 0; i15 < i11; i15++) {
            if (i15 != 1) {
                Logger.d("WebEngage", "ThresholdSize : " + i14);
                Logger.d("WebEngage", "sumOfSizeOfImages : " + a10);
                if (a(list.get(i15)) <= i14) {
                    i12 = a(list.get(i15)) + a10;
                    Logger.d("WebEngage", "Image size " + a(list.get(i15)) + " is below threshold of " + i14);
                } else {
                    Bitmap a12 = a(list.get(i15), i14);
                    list.set(i15, a12);
                    int a13 = a10 + a(a12);
                    Logger.d("WebEngage", "renderableImage Size " + a(a12));
                    i12 = a13;
                }
                int i16 = (i11 - 2) - i15;
                if (i16 > 0) {
                    i14 = (i10 - i12) / i16;
                }
                Logger.d("WebEngage", "remaining images :" + i16);
                a10 = i12;
            }
        }
        Logger.d("WebEngage", "Final sumOfSizeOfImages : " + a10);
        return list;
    }
}
