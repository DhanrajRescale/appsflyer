package com.webengage.sdk.android.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.webengage.sdk.android.utils.l.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class g {

    /* loaded from: classes2.dex */
    public static class b extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f12724a;

        /* renamed from: b, reason: collision with root package name */
        private int f12725b;

        private b(InputStream inputStream) {
            this.f12724a = inputStream;
            this.f12725b = 0;
        }

        @Override // java.io.InputStream
        public int read() {
            int read = this.f12724a.read();
            if (read != -1) {
                return read;
            }
            int i10 = this.f12725b;
            if (i10 > 0) {
                return 217;
            }
            this.f12725b = i10 + 1;
            return 255;
        }
    }

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 > i11 && i16 / i14 > i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private static Bitmap a(BitmapFactory.Options options, File file, int i10, int i11) {
        if (options.inSampleSize > 32) {
            throw new OutOfMemoryError();
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (decodeFile != null) {
                int width = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                return (((double) width) / ((double) height) != ((double) i10) / ((double) i11) || width < i10 || height < i11) ? decodeFile : Bitmap.createScaledBitmap(decodeFile, i10, i11, false);
            }
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            Bitmap decodeStream = BitmapFactory.decodeStream(new b(fileInputStream));
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
            return decodeStream;
        } catch (Exception unused2) {
            return null;
        } catch (OutOfMemoryError unused3) {
            options.inSampleSize *= 2;
            return a(options, file, i10, i11);
        }
    }

    public static Bitmap a(com.webengage.sdk.android.utils.l.g gVar, float f10, float f11, Context context) {
        return a(gVar, WebEngageUtils.a(f10, context.getApplicationContext()), WebEngageUtils.a(f11, context.getApplicationContext()), context);
    }

    public static Bitmap a(com.webengage.sdk.android.utils.l.g gVar, float f10, Context context) {
        return a(gVar, WebEngageUtils.d(context.getApplicationContext()).widthPixels, WebEngageUtils.a(f10, context.getApplicationContext()), context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(4:(16:13|14|15|16|17|19|20|21|22|23|(3:24|(1:26)(0)|27)|28|29|30|31|(2:33|(3:35|36|37)(4:38|39|40|41))(2:42|43))|30|31|(0)(0))|16|17|19|20|21|22|23|(4:24|(0)(0)|27|26)|28|29) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:5|(16:13|14|15|16|17|19|20|21|22|23|(3:24|(1:26)(0)|27)|28|29|30|31|(2:33|(3:35|36|37)(4:38|39|40|41))(2:42|43))|65|15|16|17|19|20|21|22|23|(4:24|(0)(0)|27|26)|28|29|30|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0060, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0066, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0069, code lost:
    
        r0.close();
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0071, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0070, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: all -> 0x0060, Exception -> 0x0062, LOOP:0: B:24:0x0055->B:26:0x005c, LOOP_END, TRY_LEAVE, TryCatch #9 {Exception -> 0x0062, all -> 0x0060, blocks: (B:23:0x0053, B:24:0x0055, B:26:0x005c), top: B:22:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:31:0x0076, B:33:0x0080, B:35:0x0090, B:39:0x00ab), top: B:30:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap a(com.webengage.sdk.android.utils.l.g r10, int r11, int r12, android.content.Context r13) {
        /*
            java.io.InputStream r0 = r10.h()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.Map r2 = r10.j()
            r3 = 0
            if (r2 == 0) goto L3e
            java.lang.String r4 = "content-length"
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L3e
            java.lang.Object r5 = r2.get(r4)
            if (r5 == 0) goto L3e
            java.lang.Object r5 = r2.get(r4)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r5 <= 0) goto L3e
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L3e
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.NumberFormatException -> L3e
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.NumberFormatException -> L3e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L3e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L3e
            long r4 = r2.longValue()     // Catch: java.lang.NumberFormatException -> L3e
            goto L40
        L3e:
            r4 = 0
        L40:
            java.lang.String r2 = "image__"
            java.lang.String r6 = ".temp"
            java.io.File r13 = r13.getCacheDir()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L70
            java.io.File r13 = java.io.File.createTempFile(r2, r6, r13)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L70
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L55:
            int r7 = r0.read(r6)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r8 = -1
            if (r7 == r8) goto L62
            r2.write(r6, r3, r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            goto L55
        L60:
            r10 = move-exception
            goto L66
        L62:
            r0.close()     // Catch: java.lang.Exception -> L76
            goto L73
        L66:
            r1 = r2
            goto L69
        L68:
            r10 = move-exception
        L69:
            r0.close()     // Catch: java.lang.Exception -> L6f
            r1.close()     // Catch: java.lang.Exception -> L6f
        L6f:
            throw r10
        L70:
            r13 = r1
        L71:
            r2 = r1
            goto L62
        L73:
            r2.close()     // Catch: java.lang.Exception -> L76
        L76:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Throwable -> La7
            r2 = 1
            r0.inJustDecodeBounds = r2     // Catch: java.lang.Throwable -> La7
            if (r13 == 0) goto Le0
            double r6 = (double) r4     // Catch: java.lang.Throwable -> La7
            r8 = 4607002274814922588(0x3fef5c28f5c28f5c, double:0.98)
            double r6 = r6 * r8
            long r8 = r13.length()     // Catch: java.lang.Throwable -> La7
            double r8 = (double) r8     // Catch: java.lang.Throwable -> La7
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 < 0) goto La9
            java.lang.String r10 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> La7
            android.graphics.BitmapFactory.decodeFile(r10, r0)     // Catch: java.lang.Throwable -> La7
            int r10 = a(r0, r11, r12)     // Catch: java.lang.Throwable -> La7
            r0.inSampleSize = r10     // Catch: java.lang.Throwable -> La7
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> La7
            android.graphics.Bitmap r10 = a(r0, r13, r11, r12)     // Catch: java.lang.Throwable -> La7
            r13.delete()
            return r10
        La7:
            r10 = move-exception
            goto Le4
        La9:
            java.lang.String r11 = "WebEngage"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r12.<init>()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "Incomplete image downloaded [url: "
            r12.append(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r10.m()     // Catch: java.lang.Throwable -> La7
            r12.append(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = ", total image size: "
            r12.append(r10)     // Catch: java.lang.Throwable -> La7
            r12.append(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = " bytes, downloaded image size: "
            r12.append(r10)     // Catch: java.lang.Throwable -> La7
            long r2 = r13.length()     // Catch: java.lang.Throwable -> La7
            r12.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = " bytes]"
            r12.append(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> La7
            com.webengage.sdk.android.Logger.e(r11, r10)     // Catch: java.lang.Throwable -> La7
            r13.delete()
            return r1
        Le0:
            r13.delete()
            return r1
        Le4:
            r13.delete()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.utils.g.a(com.webengage.sdk.android.utils.l.g, int, int, android.content.Context):android.graphics.Bitmap");
    }

    public static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    inputStream.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Map<String, Object> a(InputStream inputStream, boolean z10) {
        return new e(inputStream, z10).b();
    }

    public static void a(Set<String> set, Context context) {
        if (set == null || set.size() == 0) {
            return;
        }
        for (String str : set) {
            if (!str.isEmpty()) {
                com.webengage.sdk.android.utils.a.a(new f.b(str, com.webengage.sdk.android.utils.l.e.GET, context.getApplicationContext()).a(2).a());
            }
        }
    }
}
