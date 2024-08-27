package zq;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.a1;
import b0.l1;
import c2.i;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioFnoHistoryViewModel;
import com.assetgro.stockgro.ui.portfolio.history.model.PortfolioHistoryFnoDataItem;
import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.n0;
import d2.w0;
import g1.l;
import j2.g0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jr.h;
import ka.e1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import m0.b9;
import m0.o0;
import n9.p;
import nl.t;
import nl.v;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import qu.i0;
import r0.a2;
import t.m0;
import t0.g1;
import t0.m;
import t0.m2;
import t0.n;
import t0.o3;
import t0.p3;
import t0.r;
import t0.r1;
import t0.x1;
import tb.z;
import tu.s0;
import ug.j;
import ug.k;
import v.c0;
import v.h0;
import v.r0;
import v.u0;
import vt.y;
import w.e0;
import w.f1;
import w.p0;
import w.t1;
import yk.o;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static Class f42803a = null;

    /* renamed from: b, reason: collision with root package name */
    public static r1.f f42804b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f42805c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f42806d = true;

    public static String A(byte[] bArr) {
        if (bArr == null) {
            return "!!!EMPTY BYTES!!!";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            cArr[i11] = charArray[(b10 & 255) >>> 4];
            cArr[i11 + 1] = charArray[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean B(Object[] objArr, vk.f fVar) {
        int i10;
        if (fVar == null) {
            i10 = 0;
            while (i10 < objArr.length) {
                if (objArr[i10] != null) {
                    i10++;
                }
            }
            return false;
        }
        if (!objArr.getClass().getComponentType().isInstance(fVar)) {
            return false;
        }
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (fVar.equals(objArr[i11])) {
                i10 = i11;
            }
        }
        return false;
        if (i10 == -1) {
            return false;
        }
        return true;
    }

    public static void C(InputStream inputStream, OutputStream out) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            out.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static a1 D(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (a1) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }

    public static final bu.b E(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new bu.b(entries);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [pl.c, java.lang.Object] */
    public static final void F(Throwable th2) {
        HashMap hashMap;
        t feature;
        if (f42805c && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                v vVar = v.f28944a;
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "it.className");
                Intrinsics.checkNotNullParameter(className, "className");
                synchronized (v.f28944a) {
                    hashMap = v.f28945b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(t.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(t.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(t.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(t.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(t.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(t.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(t.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(t.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(t.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(t.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        hashMap.put(t.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        hashMap.put(t.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(t.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(t.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(t.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        feature = (t) entry.getKey();
                        String[] strArr = (String[]) entry.getValue();
                        int length = strArr.length;
                        int i10 = 0;
                        while (i10 < length) {
                            String str = strArr[i10];
                            i10++;
                            if (s.r(className, str, false)) {
                                break;
                            }
                        }
                    } else {
                        feature = t.Unknown;
                        break;
                    }
                }
                if (feature != t.Unknown) {
                    v vVar2 = v.f28944a;
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    SharedPreferences.Editor edit = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit();
                    feature.getClass();
                    edit.putString(Intrinsics.i(feature, "FBSDKFeature"), FacebookSdk.getSdkVersion()).apply();
                    hashSet.add(feature.toString());
                }
            }
            if (FacebookSdk.getAutoLogAppEventsEnabled() && (!hashSet.isEmpty())) {
                JSONArray features = new JSONArray((Collection) hashSet);
                Intrinsics.checkNotNullParameter(features, "features");
                ?? obj = new Object();
                obj.f31159b = pl.a.f31151b;
                Long valueOf = Long.valueOf(System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                obj.f31164g = valueOf;
                obj.f31160c = features;
                StringBuffer stringBuffer = new StringBuffer("analysis_log_");
                stringBuffer.append(String.valueOf(valueOf));
                stringBuffer.append(".json");
                String stringBuffer2 = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
                obj.f31158a = stringBuffer2;
                obj.b();
            }
        }
    }

    public static int G(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static byte[] H(String str) {
        String replace = str.replace(" ", HttpUrl.FRAGMENT_ENCODE_SET);
        if (replace.length() % 2 == 0) {
            byte[] bArr = new byte[Math.round(replace.length() / 2.0f)];
            int i10 = 0;
            int i11 = 0;
            while (i10 < replace.length()) {
                int i12 = i10 + 2;
                bArr[i11] = Integer.valueOf(Integer.parseInt(replace.substring(i10, i12), 16)).byteValue();
                i10 = i12;
                i11++;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex binary needs to be even-length :".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int I(android.app.Activity r5) {
        /*
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r5.findViewById(r0)
            android.view.View r5 = r5.getRootView()
            boolean r0 = r5.isDrawingCacheEnabled()
            r1 = 1
            r5.setDrawingCacheEnabled(r1)
            r5.buildDrawingCache(r1)
            android.graphics.Bitmap r2 = r5.getDrawingCache()
            r3 = 0
            if (r2 == 0) goto L35
            int r4 = r2.getWidth()
            if (r4 <= 0) goto L35
            int r4 = r2.getHeight()
            if (r4 <= 0) goto L35
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r2, r1, r1, r3)     // Catch: java.lang.OutOfMemoryError -> L2e
            goto L36
        L2e:
            java.lang.String r1 = "MixpanelAPI.ActImgUtils"
            java.lang.String r2 = "Not enough memory to produce scaled image, returning a null screenshot"
            el.l.l0(r1, r2)
        L35:
            r1 = 0
        L36:
            if (r0 != 0) goto L3b
            r5.setDrawingCacheEnabled(r3)
        L3b:
            if (r1 == 0) goto L42
            int r5 = r1.getPixel(r3, r3)
            goto L44
        L42:
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L44:
            r0 = 3
            float[] r0 = new float[r0]
            android.graphics.Color.colorToHSV(r5, r0)
            r5 = 2
            r1 = 1050253722(0x3e99999a, float:0.3)
            r0[r5] = r1
            r5 = 242(0xf2, float:3.39E-43)
            int r5 = android.graphics.Color.HSVToColor(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.I(android.app.Activity):int");
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, vk.d] */
    public static vk.d J(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr;
        String str;
        if (byteArrayInputStream.available() >= 2) {
            byteArrayInputStream.mark(0);
            int read = byteArrayInputStream.read();
            while (true) {
                byte b10 = (byte) read;
                if (read == -1 || !(b10 == -1 || b10 == 0)) {
                    break;
                }
                byteArrayInputStream.mark(0);
                read = byteArrayInputStream.read();
            }
            byteArrayInputStream.reset();
            if (byteArrayInputStream.available() >= 2) {
                byte[] c02 = c0(byteArrayInputStream);
                byteArrayInputStream.mark(0);
                int available = byteArrayInputStream.available();
                int d02 = d0(byteArrayInputStream);
                int available2 = byteArrayInputStream.available();
                byteArrayInputStream.reset();
                int i10 = available - available2;
                byte[] bArr2 = new byte[i10];
                int i11 = 1;
                if (i10 >= 1 && i10 <= 4) {
                    byteArrayInputStream.read(bArr2, 0, i10);
                    if (i10 > 0 && i10 <= 4) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < i10; i13++) {
                            i12 += (bArr2[i13] & 255) << (((i10 - i13) - 1) * 8);
                        }
                        vk.f f02 = f0(c02);
                        if (i12 == 128) {
                            byteArrayInputStream.mark(0);
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                int read2 = byteArrayInputStream.read();
                                if (read2 >= 0) {
                                    if (i11 == 0 && read2 == 0) {
                                        d02 = i14 - 1;
                                        bArr = new byte[d02];
                                        byteArrayInputStream.reset();
                                        byteArrayInputStream.read(bArr, 0, d02);
                                        break;
                                    }
                                    i14 = i15;
                                    i11 = read2;
                                } else {
                                    throw new RuntimeException("Error parsing data. TLV length byte indicated indefinite length, but EOS was reached before 0x0000 was found" + byteArrayInputStream.available());
                                }
                            }
                        } else {
                            if (byteArrayInputStream.available() < d02) {
                                StringBuilder n10 = a3.a.n("Length byte(s) indicated ", d02, " value bytes, but only ");
                                n10.append(byteArrayInputStream.available());
                                n10.append(" ");
                                if (byteArrayInputStream.available() > 1) {
                                    str = "are";
                                } else {
                                    str = "is";
                                }
                                throw new RuntimeException(nn.d.o(n10, str, " available"));
                            }
                            bArr = new byte[d02];
                            byteArrayInputStream.read(bArr, 0, d02);
                        }
                        byteArrayInputStream.mark(0);
                        int read3 = byteArrayInputStream.read();
                        while (true) {
                            byte b11 = (byte) read3;
                            if (read3 == -1 || !(b11 == -1 || b11 == 0)) {
                                break;
                            }
                            byteArrayInputStream.mark(0);
                            read3 = byteArrayInputStream.read();
                        }
                        byteArrayInputStream.reset();
                        ?? obj = new Object();
                        if (d02 == bArr.length) {
                            obj.f38156a = f02;
                            obj.f38157b = bArr;
                            return obj;
                        }
                        throw new IllegalArgumentException("length != bytes.length");
                    }
                    throw new IllegalArgumentException(h.n("Length must be between 1 and 4. Length = ", i10));
                }
                throw new RuntimeException(h.n("Number of length bytes must be from 1 to 4. Found ", i10));
            }
            throw new RuntimeException("Error parsing data. Available bytes < 2 . Length=" + byteArrayInputStream.available());
        }
        throw new RuntimeException("Error parsing data. Available bytes < 2 . Length=" + byteArrayInputStream.available());
    }

    public static byte[] K(byte[] bArr, vk.f... fVarArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                vk.d J = J(byteArrayInputStream);
                vk.f fVar = J.f38156a;
                boolean B = B(fVarArr, fVar);
                byte[] bArr3 = J.f38157b;
                if (B) {
                    return bArr3;
                }
                if (fVar.f38164e == 2 && (bArr2 = K(bArr3, fVarArr)) != null) {
                    break;
                }
            }
        }
        return bArr2;
    }

    public static ArrayList L(byte[] bArr, vk.f... fVarArr) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            vk.d J = J(byteArrayInputStream);
            vk.f fVar = J.f38156a;
            if (B(fVarArr, fVar)) {
                arrayList.add(J);
            } else if (fVar.f38164e == 2) {
                arrayList.addAll(L(J.f38157b, fVarArr));
            }
        }
        return arrayList;
    }

    public static final void M(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static void N(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean O(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        int i11 = rect.top;
                        int i12 = rect2.top;
                        if ((i11 >= i12 && rect.bottom > i12) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i13 = rect.left;
                int i14 = rect2.left;
                if ((i13 >= i14 && rect.right > i14) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 <= i16 && rect.top < i16) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i17 = rect.right;
        int i18 = rect2.right;
        if ((i17 <= i18 && rect.left < i18) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static boolean P(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean Q(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length < 2 || bArr[bArr.length - 2] != bArr2[0] || bArr[bArr.length - 1] != bArr2[1]) {
            return false;
        }
        return true;
    }

    public static boolean R(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static boolean S(int i10, Object obj) {
        int i11;
        if (!(obj instanceof ut.d)) {
            return false;
        }
        if (obj instanceof iu.g) {
            i11 = ((iu.g) obj).getArity();
        } else if (obj instanceof Function0) {
            i11 = 0;
        } else if (obj instanceof Function1) {
            i11 = 1;
        } else if (obj instanceof Function2) {
            i11 = 2;
        } else if (obj instanceof hu.c) {
            i11 = 3;
        } else if (obj instanceof hu.d) {
            i11 = 4;
        } else {
            boolean z10 = obj instanceof b1.a;
            if (z10) {
                i11 = 5;
            } else if (obj instanceof hu.e) {
                i11 = 6;
            } else if (z10) {
                i11 = 7;
            } else if (z10) {
                i11 = 8;
            } else if (z10) {
                i11 = 9;
            } else if (z10) {
                i11 = 10;
            } else if (z10) {
                i11 = 11;
            } else if (z10) {
                i11 = 13;
            } else if (z10) {
                i11 = 14;
            } else if (z10) {
                i11 = 15;
            } else if (z10) {
                i11 = 16;
            } else if (z10) {
                i11 = 17;
            } else if (z10) {
                i11 = 18;
            } else if (z10) {
                i11 = 19;
            } else if (z10) {
                i11 = 20;
            } else if (z10) {
                i11 = 21;
            } else {
                i11 = -1;
            }
        }
        if (i11 != i10) {
            return false;
        }
        return true;
    }

    public static boolean T(char c10) {
        if (c10 == '\r' || c10 == '*' || c10 == '>' || c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static final m0 U(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new m0(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object V(java.util.List r4, yt.a r5) {
        /*
            boolean r0 = r5 instanceof qu.c
            if (r0 == 0) goto L13
            r0 = r5
            qu.c r0 = (qu.c) r0
            int r1 = r0.f32190c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32190c = r1
            goto L18
        L13:
            qu.c r0 = new qu.c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32189b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f32190c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f32188a
            ut.n.b(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ut.n.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            qu.o1 r5 = (qu.o1) r5
            r0.f32188a = r4
            r0.f32190c = r3
            java.lang.Object r5 = r5.S(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            kotlin.Unit r4 = kotlin.Unit.f23355a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.V(java.util.List, yt.a):java.lang.Object");
    }

    public static final void W(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        com.bumptech.glide.b.e(imageView.getContext()).m(str).z(imageView);
    }

    public static final void X(ImageView imageView, String str, int i10) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.e(imageView.getContext()).m(str).l(i10)).b()).z(imageView);
    }

    public static int Y(String str, int i10, int i11) {
        float[] fArr;
        int i12;
        if (i10 >= str.length()) {
            return i11;
        }
        int i13 = 6;
        if (i11 == 0) {
            fArr = new float[]{s0.g.f34069a, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i10 + i15;
            if (i16 == str.length()) {
                byte[] bArr = new byte[i13];
                int[] iArr = new int[i13];
                int G = G(fArr, iArr, bArr);
                int i17 = i14;
                int i18 = i17;
                while (i17 < i13) {
                    i18 += bArr[i17];
                    i17++;
                }
                if (iArr[i14] == G) {
                    return i14;
                }
                if (i18 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i18 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i18 == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (i18 != 1 || bArr[3] <= 0) {
                    return 1;
                }
                return 3;
            }
            char charAt = str.charAt(i16);
            i15++;
            if (P(charAt)) {
                fArr[i14] = fArr[i14] + 0.5f;
            } else if (R(charAt)) {
                float ceil = (float) Math.ceil(fArr[i14]);
                fArr[i14] = ceil;
                fArr[i14] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil(fArr[i14]);
                fArr[i14] = ceil2;
                fArr[i14] = ceil2 + 1.0f;
            }
            if (charAt != ' ' && ((charAt < '0' || charAt > '9') && (charAt < 'A' || charAt > 'Z'))) {
                if (R(charAt)) {
                    fArr[1] = fArr[1] + 2.6666667f;
                } else {
                    fArr[1] = fArr[1] + 1.3333334f;
                }
            } else {
                fArr[1] = fArr[1] + 0.6666667f;
            }
            if (charAt != ' ' && ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'z'))) {
                if (R(charAt)) {
                    fArr[2] = fArr[2] + 2.6666667f;
                } else {
                    fArr[2] = fArr[2] + 1.3333334f;
                }
            } else {
                fArr[2] = fArr[2] + 0.6666667f;
            }
            if (T(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (R(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (R(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i15 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                G(fArr, iArr2, bArr2);
                int i19 = 0;
                for (int i20 = 0; i20 < 6; i20++) {
                    i19 += bArr2[i20];
                }
                i12 = 0;
                int i21 = iArr2[0];
                int i22 = iArr2[5];
                if (i21 < i22 && i21 < iArr2[1] && i21 < iArr2[2] && i21 < iArr2[3] && i21 < iArr2[4]) {
                    return 0;
                }
                if (i22 < i21) {
                    break;
                }
                byte b10 = bArr2[1];
                byte b11 = bArr2[2];
                byte b12 = bArr2[3];
                byte b13 = bArr2[4];
                if (b10 + b11 + b12 + b13 == 0) {
                    break;
                }
                if (i19 == 1 && b13 > 0) {
                    return 4;
                }
                if (i19 == 1 && b11 > 0) {
                    return 2;
                }
                if (i19 == 1 && b12 > 0) {
                    return 3;
                }
                int i23 = iArr2[1];
                int i24 = i23 + 1;
                if (i24 < i21 && i24 < i22 && i24 < iArr2[4] && i24 < iArr2[2]) {
                    int i25 = iArr2[3];
                    if (i23 < i25) {
                        return 1;
                    }
                    if (i23 == i25) {
                        for (int i26 = i10 + i15 + 1; i26 < str.length(); i26++) {
                            char charAt2 = str.charAt(i26);
                            if (charAt2 == '\r' || charAt2 == '*' || charAt2 == '>') {
                                return 3;
                            }
                            if (!T(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            } else {
                i12 = 0;
            }
            i14 = i12;
            i13 = 6;
        }
        return 5;
    }

    public static int Z(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        i11 = rect2.top;
                        i12 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i11 = rect2.left;
                    i12 = rect.right;
                }
            } else {
                i11 = rect.top;
                i12 = rect2.bottom;
            }
        } else {
            i11 = rect.left;
            i12 = rect2.right;
        }
        return Math.max(0, i11 - i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r32, java.lang.String r33, boolean r34, boolean r35, t0.n r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.a(java.lang.String, java.lang.String, boolean, boolean, t0.n, int, int):void");
    }

    public static boolean a0(int i10, int i11) {
        if (i11 >= 0 && i11 <= 31) {
            if ((i10 & (1 << i11)) != 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(h.n("parameter 'pBitIndex' must be between 0 and 31. pBitIndex=", i11));
    }

    public static final void b(int i10, int i11, n nVar, String str, String str2) {
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(819213270);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
        } else {
            if (i15 != 0) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (i16 != 0) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Intrinsics.checkNotNullParameter("notifications.json", "assetName");
            pp.b.b(androidx.compose.foundation.layout.d.q(l.f16404b, 180), h0.h.b(10), 0L, null, 4, b1.d.c(400708089, new o0(13, str2, str, o.V(new p("notifications.json"), rVar, 6)), rVar), rVar, 1769478, 28);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new dd.c(str, str2, i10, i11);
        }
    }

    public static int b0(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(g1.o r27, java.lang.String r28, long r29, long r31, int r33, o2.s r34, t0.n r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.c(g1.o, java.lang.String, long, long, int, o2.s, t0.n, int, int):void");
    }

    public static byte[] c0(ByteArrayInputStream byteArrayInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte read = (byte) byteArrayInputStream.read();
        byteArrayOutputStream.write(read);
        if ((read & 31) == 31) {
            while (true) {
                int read2 = byteArrayInputStream.read();
                if (read2 >= 0) {
                    byte b10 = (byte) read2;
                    byteArrayOutputStream.write(b10);
                    if (!a0(b10, 7) || (a0(b10, 7) && (b10 & Byte.MAX_VALUE) == 0)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final void d(Function0 function0, Function0 dismiss, n nVar, int i10, int i11) {
        Function0 function02;
        int i12;
        int i13;
        int i14;
        Function0 function03;
        Function0 function04;
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        r rVar = (r) nVar;
        rVar.c0(-1343836999);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            function02 = function0;
        } else if ((i10 & 14) == 0) {
            function02 = function0;
            if (rVar.j(function02)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            function02 = function0;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.j(dismiss)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
            function04 = function02;
        } else {
            if (i15 != 0) {
                function03 = dh.a.f14380a;
            } else {
                function03 = function02;
            }
            pp.b.b(androidx.compose.foundation.layout.d.e(l.f16404b, 1.0f), h0.h.a(4, 4), 0L, null, s0.g.f34069a, b1.d.c(-1439554340, new o0(17, (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b), function03, dismiss), rVar), rVar, 1572870, 60);
            function04 = function03;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c0.o(i10, i11, 6, function04, dismiss);
        }
    }

    public static int d0(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read >= 0) {
            if (read > 127 && read != 128) {
                int i10 = read & 127;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    int read2 = byteArrayInputStream.read();
                    if (read2 >= 0) {
                        i11 = (i11 << 8) | read2;
                    } else {
                        throw new RuntimeException("EOS when reading length bytes");
                    }
                }
                return i11;
            }
            return read;
        }
        throw new RuntimeException(h.n("Negative length: ", read));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(pg.c r32, pg.c r33, kotlin.jvm.functions.Function1 r34, t0.n r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.e(pg.c, pg.c, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final void e0(int i10, int i11, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i10 < i11) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i10] = null;
            i10++;
        }
    }

    public static final void f(PortfolioFnoHistoryViewModel viewModel, PortfolioHistoryFnoDataItem itemData, n nVar, int i10) {
        String s7;
        Object kVar;
        double entryPrice;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(itemData, "item");
        r rVar = (r) nVar;
        rVar.c0(761698625);
        w0.e(R.color.disabled_black, rVar);
        viewModel.getClass();
        Intrinsics.checkNotNullParameter(itemData, "item");
        if (!Intrinsics.a(itemData.getStatus(), "cancelled")) {
            int i11 = n1.t.f28178j;
        }
        Intrinsics.checkNotNullParameter(itemData, "item");
        if (Intrinsics.a(itemData.getStatus(), "cancelled")) {
            s7 = kj.f.s(itemData.getEntryDate());
        } else {
            s7 = kj.f.s(itemData.getExecutionDate());
        }
        String str = s7;
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        String status = itemData.getStatus();
        Locale locale = Locale.ROOT;
        String lowerCase = status.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = "Pending".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        boolean a10 = Intrinsics.a(lowerCase, lowerCase2);
        j jVar = j.f37186c;
        j jVar2 = j.f37187d;
        j jVar3 = j.f37188e;
        if (a10) {
            kVar = jVar3;
        } else {
            String lowerCase3 = "Executed".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (Intrinsics.a(lowerCase, lowerCase3)) {
                kVar = jVar2;
            } else {
                String lowerCase4 = "Cancelled".toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                if (Intrinsics.a(lowerCase, lowerCase4)) {
                    kVar = jVar;
                } else {
                    kVar = new k(itemData.getStatus());
                }
            }
        }
        if (Intrinsics.a(kVar, jVar)) {
            entryPrice = itemData.getEntryPrice();
        } else if (Intrinsics.a(kVar, jVar2)) {
            entryPrice = itemData.getExecutionPrice();
        } else if (Intrinsics.a(kVar, jVar3)) {
            entryPrice = itemData.getEntryPrice();
        } else if (kVar instanceof k) {
            entryPrice = itemData.getEntryPrice();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        double d10 = entryPrice;
        float f10 = 16;
        int i12 = 16;
        pp.b.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(l.f16404b, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f), h0.h.b(12), 0L, null, hl.f.S(R.dimen.default_card_elevation, rVar), b1.d.c(-1246617756, new mg.c(viewModel, itemData, str, d10), rVar), rVar, 1572870, 28);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(viewModel, itemData, i10, i12);
        }
    }

    public static vk.f f0(byte[] bArr) {
        LinkedHashMap linkedHashMap = vk.b.f38145a;
        bArr.getClass();
        vk.f fVar = (vk.f) linkedHashMap.get(new vk.a(bArr));
        if (fVar == null) {
            return new vk.f(bArr, 1, "[UNKNOWN TAG]");
        }
        return fVar;
    }

    public static final void g(Function0 scratchCardAlertClicked, n nVar, int i10) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(scratchCardAlertClicked, "scratchCardAlertClicked");
        r rVar = (r) nVar;
        rVar.c0(-1075947600);
        int i13 = 2;
        if ((i10 & 14) == 0) {
            if (rVar.j(scratchCardAlertClicked)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(1017987254);
            Object Q = rVar.Q();
            to.e eVar = m.f35080a;
            if (Q == eVar) {
                Q = t0.t.n0(Boolean.FALSE, o3.f35116a);
                rVar.k0(Q);
            }
            g1 g1Var = (g1) Q;
            rVar.s(false);
            Boolean bool = Boolean.TRUE;
            rVar.b0(1017989819);
            Object Q2 = rVar.Q();
            if (Q2 == eVar) {
                Q2 = new vh.a(g1Var, null);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t0.t.e(bool, (Function2) Q2, rVar);
            boolean booleanValue = ((Boolean) g1Var.getValue()).booleanValue();
            w.x1 x10 = w.e.x(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 0, e0.f38472c, 2);
            c0 c0Var = new c0(5, vh.b.f38048b);
            f1 f1Var = androidx.compose.animation.b.f1168a;
            iu.j.d(booleanValue, null, new h0(new u0(null, new r0(x10, c0Var), null, false, null, 61)), null, null, b1.d.c(-1610094632, new tb.j(scratchCardAlertClicked, i13), rVar), rVar, 196608, 26);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new z(i10, 1, scratchCardAlertClicked);
        }
    }

    public static final void g0(String str, String str2) {
        try {
            if (f42803a == null) {
                Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
                Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
                f42803a = cls;
            }
            Class cls2 = f42803a;
            if (cls2 != null) {
                Method method = cls2.getMethod("UnitySendMessage", String.class, String.class, String.class);
                Class cls3 = f42803a;
                if (cls3 != null) {
                    method.invoke(cls3, "UnityFacebookSDKPlugin", str, str2);
                    return;
                } else {
                    Intrinsics.k("unityPlayer");
                    throw null;
                }
            }
            Intrinsics.k("unityPlayer");
            throw null;
        } catch (Exception e10) {
            Log.e("zq.f", "Failed to send message to Unity", e10);
        }
    }

    public static final void h(Function1 function1, n nVar, int i10, int i11) {
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(-1164654366);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.j(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                function1 = dh.b.f14381a;
            }
            pp.b.b(androidx.compose.foundation.layout.d.e(l.f16404b, 1.0f), h0.h.a(4, 4), 0L, null, s0.g.f34069a, b1.d.c(-1039607201, new p3(13, function1), rVar), rVar, 1572870, 60);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new e1(function1, i10, i11, 1);
        }
    }

    public static byte h0(byte b10, int i10) {
        if (i10 >= 0 && i10 <= 7) {
            return (byte) (b10 | (1 << i10));
        }
        throw new IllegalArgumentException(h.n("parameter 'pBitIndex' must be between 0 and 7. pBitIndex=", i10));
    }

    public static final void i(g1.o oVar, n nVar, int i10, int i11) {
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(731146834);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                oVar = l.f16404b;
            }
            androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.n(oVar, 17, 10), uh.b.f37193a, rVar, 48);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, 7);
        }
    }

    public static final void i0(TextView textView, Pair pair) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (pair != null) {
            Object obj = pair.f23353a;
            if (((CharSequence) obj).length() > 0) {
                textView.setVisibility(0);
                textView.setText((CharSequence) obj);
                textView.setBackgroundDrawable(r3.k.getDrawable(textView.getContext(), ((Number) pair.f23354b).intValue()));
                return;
            }
        }
        textView.setVisibility(8);
    }

    public static final void j(PortfolioFnoHistoryViewModel viewModel, Function0 bottomSheetOpen, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bottomSheetOpen, "bottomSheetOpen");
        r rVar = (r) nVar;
        rVar.c0(-1836203742);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        g1 o02 = t0.t.o0(viewModel.f9815r, rVar);
        g1 K0 = yk.j.K0(new s0(viewModel.f9817t), rVar);
        List g10 = y.g("All", "Bought", "Sold", "Cancelled");
        rVar.b0(-999526918);
        Object Q = rVar.Q();
        to.e eVar = m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        Object h10 = v.e.h(rVar, false, -999525002);
        if (h10 == eVar) {
            h10 = t0.t.n0(0, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var2 = (g1) h10;
        rVar.s(false);
        p0.o D1 = dp.b.D1(((Boolean) K0.getValue()).booleanValue(), new c0.s(21, viewModel, g10, g1Var2), rVar, 0);
        t0.t.e(Integer.valueOf(((Number) g1Var2.getValue()).intValue()), new mg.d(viewModel, g10, g1Var2, null), rVar);
        l lVar = l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        g1.o K02 = al.d.K0(fillElement, D1);
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(K02);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t0.t.v0(rVar, c10, c2.k.f7749e);
            t0.t.v0(rVar, o10, c2.k.f7748d);
            i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            i0.c(fillElement, null, null, false, null, null, null, false, new lb.l(g10, bottomSheetOpen, g1Var, g1Var2, o02, context, viewModel), rVar, 6, 254);
            p0.h.a(((Boolean) K0.getValue()).booleanValue(), D1, bVar.a(lVar, g1.a.f16380b), 0L, 0L, false, rVar, 64, 56);
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new t1(viewModel, bottomSheetOpen, i10, 17);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static void j0(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f42806d) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f42806d = false;
            }
        }
    }

    public static final void k(uh.i uiState, List scratchCards, Function0 onPopupDismissed, Function1 onCardScratched, n nVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(scratchCards, "scratchCards");
        Intrinsics.checkNotNullParameter(onPopupDismissed, "onPopupDismissed");
        Intrinsics.checkNotNullParameter(onCardScratched, "onCardScratched");
        r rVar = (r) nVar;
        rVar.c0(1837875846);
        rVar.b0(-980854874);
        int i11 = (i10 & 14) ^ 6;
        if ((i11 > 4 && rVar.h(uiState)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = m.f35080a;
        if (z10 || Q == eVar) {
            Q = uiState.f37203a;
            rVar.k0(Q);
        }
        String str = (String) Q;
        rVar.s(false);
        rVar.b0(-980852216);
        if ((i11 > 4 && rVar.h(uiState)) || (i10 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object Q2 = rVar.Q();
        if (z11 || Q2 == eVar) {
            Q2 = uiState.f37204b;
            rVar.k0(Q2);
        }
        String str2 = (String) Q2;
        rVar.s(false);
        rVar.b0(-980849255);
        if ((i11 > 4 && rVar.h(uiState)) || (i10 & 6) == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        Object Q3 = rVar.Q();
        if (z12 || Q3 == eVar) {
            Q3 = Boolean.valueOf(uiState.f37205c);
            rVar.k0(Q3);
        }
        boolean booleanValue = ((Boolean) Q3).booleanValue();
        rVar.s(false);
        if (booleanValue) {
            l lVar = l.f16404b;
            FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
            g1.o d10 = androidx.compose.foundation.a.d(fillElement, kq.e.R(y.g(new n1.t(n1.t.c(w0.e(R.color.white, rVar), s0.g.f34069a)), new n1.t(n1.t.c(w0.e(R.color.white, rVar), 0.2f)), new n1.t(n1.t.c(w0.e(R.color.white, rVar), 0.5f)), new n1.t(n1.t.c(w0.e(R.color.white, rVar), 1.0f)), new n1.t(n1.t.c(w0.e(R.color.white, rVar), 1.0f))), s0.g.f34069a, 14), null, 6);
            rVar.b0(-980822736);
            if ((((i10 & 896) ^ 384) > 256 && rVar.h(onPopupDismissed)) || (i10 & 384) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object Q4 = rVar.Q();
            if (z13 || Q4 == eVar) {
                Q4 = v.e.n(onPopupDismissed, 11, rVar);
            }
            rVar.s(false);
            g1.o k10 = androidx.compose.foundation.a.k(d10, (Function0) Q4, 7);
            rVar.b0(733328855);
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
            rVar.b0(-1323940314);
            int i12 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(k10);
            boolean z15 = rVar.f35166a instanceof t0.f;
            if (z15) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                i iVar = c2.k.f7749e;
                t0.t.v0(rVar, c10, iVar);
                i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar, i12, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                b0.f fVar = b0.n.f2938d;
                g1.e eVar2 = g1.a.f16392n;
                rVar.b0(-483455358);
                l1 a10 = b0.y.a(fVar, eVar2, rVar, 54);
                rVar.b0(-1323940314);
                int i13 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(fillElement);
                if (z15) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar, i13, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    rVar.b0(844080943);
                    if ((((i10 & 7168) ^ 3072) > 2048 && rVar.h(onCardScratched)) || (i10 & 3072) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Object Q5 = rVar.Q();
                    if (z14 || Q5 == eVar) {
                        Q5 = new c0(23, onCardScratched);
                        rVar.k0(Q5);
                    }
                    rVar.s(false);
                    dp.b.U(8, rVar, scratchCards, (Function1) Q5);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 24), rVar);
                    al.d.C(str, null, w0.e(R.color.black_1A1A1A, rVar), yk.j.e1(20), null, null, jh.c.f21376e, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                    al.d.C(str2, null, w0.e(R.color.black_1A1A1A, rVar), yk.j.e1(16), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 18), rVar);
                    al.d.z(R.drawable.ic_white_cross_accent_background, null, androidx.compose.foundation.layout.d.m(lVar, 32), 0L, rVar, 390, 10);
                    v.e.u(lVar, 40, rVar, false, true);
                    v.e.y(rVar, false, false, false, true);
                    rVar.s(false);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new a2(uiState, scratchCards, onPopupDismissed, onCardScratched, i10);
        }
    }

    public static void k0(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(a3.a.g(name, " cannot be cast to ", str));
        Intrinsics.h(f.class.getName(), classCastException);
        throw classCastException;
    }

    public static final void l(HomeViewModel viewModel, Function1 onCardScratched, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onCardScratched, "onCardScratched");
        r rVar = (r) nVar;
        rVar.c0(1100373220);
        g1 K0 = yk.j.K0(viewModel.f9555x, rVar);
        int i11 = 1;
        if (((uh.i) K0.getValue()).f37206d) {
            rVar.b0(1407589480);
            g(new hf.l(viewModel, i11), rVar, 0);
            rVar.s(false);
        } else if (((uh.i) K0.getValue()).f37205c) {
            rVar.b0(1407843680);
            uh.i iVar = (uh.i) K0.getValue();
            e1.s sVar = viewModel.f9557z;
            hf.l lVar = new hf.l(viewModel, 2);
            rVar.b0(1985086245);
            if ((((i10 & 112) ^ 48) <= 32 || !rVar.h(onCardScratched)) && (i10 & 48) != 32) {
                i11 = 0;
            }
            Object Q = rVar.Q();
            if (i11 != 0 || Q == m.f35080a) {
                Q = new c0(24, onCardScratched);
                rVar.k0(Q);
            }
            rVar.s(false);
            k(iVar, sVar, lVar, (Function1) Q, rVar, 0);
            rVar.s(false);
        } else if (((uh.i) K0.getValue()).f37207e) {
            rVar.b0(1408257778);
            n(0, rVar, hl.f.c1(R.string.scratch_card_tooltip_message, rVar));
            rVar.s(false);
        } else {
            rVar.b0(1408354839);
            rVar.s(false);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(viewModel, onCardScratched, i10, 19);
        }
    }

    public static void l0(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th2);
                }
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }

    public static final void m(g1.o modifier, th.b card, Function0 onScratchCardClicked, n nVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(onScratchCardClicked, "onScratchCardClicked");
        r rVar = (r) nVar;
        rVar.c0(-1656812837);
        if ((i10 & 14) == 0) {
            if (rVar.h(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(card)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.j(onScratchCardClicked)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.o a10 = h2.l.a(modifier.g(androidx.compose.foundation.layout.d.f1286c), false, vh.b.f38051e);
            rVar.b0(833651607);
            if ((i11 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q = rVar.Q();
            if (z10 || Q == m.f35080a) {
                Q = v.e.n(onScratchCardClicked, 14, rVar);
            }
            rVar.s(false);
            g1.o k10 = androidx.compose.foundation.a.k(a10, (Function0) Q, 7);
            rVar.b0(733328855);
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(k10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, c10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
                l lVar = l.f16404b;
                al.d.z(R.drawable.scratch_card_placeholder, null, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, 120), false, vh.b.f38052f), 0L, rVar, 6, 10);
                if (card.f36081b.length() > 0) {
                    z11 = true;
                    pp.b.b(androidx.compose.foundation.layout.a.x(bVar.a(androidx.compose.foundation.layout.d.u(lVar, null, 3), g1.a.f16381c), s0.g.f34069a, 4, 8, s0.g.f34069a, 9), h0.h.b(10), w0.e(R.color.orange_FF823B, rVar), null, s0.g.f34069a, b1.d.c(1061238495, new be.b(card, 19), rVar), rVar, 1572864, 56);
                } else {
                    z11 = true;
                }
                v.e.y(rVar, false, z11, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(modifier, card, onScratchCardClicked, i10, 20);
        }
    }

    public static final void m0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
    }

    public static final void n(int i10, n nVar, String text) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(text, "text");
        r rVar = (r) nVar;
        rVar.c0(1882581293);
        if ((i10 & 14) == 0) {
            if (rVar.h(text)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        int i13 = 1;
        if ((i11 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            Object g10 = v.e.g(rVar, -1580209613, -1639778166);
            to.e eVar = m.f35080a;
            if (g10 == eVar) {
                g10 = t0.t.n0(Boolean.TRUE, o3.f35116a);
                rVar.k0(g10);
            }
            g1 g1Var = (g1) g10;
            rVar.s(false);
            rVar.s(false);
            if (((Boolean) g1Var.getValue()).booleanValue()) {
                Unit unit = Unit.f23355a;
                rVar.b0(-1388938779);
                boolean h10 = rVar.h(g1Var);
                Object Q = rVar.Q();
                if (h10 || Q == eVar) {
                    Q = new uh.c(g1Var, null);
                    rVar.k0(Q);
                }
                rVar.s(false);
                t0.t.e(unit, (Function2) Q, rVar);
                l lVar = l.f16404b;
                FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
                g1.g gVar = g1.a.f16381c;
                rVar.b0(733328855);
                b0.v c10 = b0.s.c(gVar, false, rVar, 6);
                rVar.b0(-1323940314);
                int i14 = rVar.P;
                r1 o10 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(fillElement);
                boolean z10 = rVar.f35166a instanceof t0.f;
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    i iVar = c2.k.f7749e;
                    t0.t.v0(rVar, c10, iVar);
                    i iVar2 = c2.k.f7748d;
                    t0.t.v0(rVar, o10, iVar2);
                    i iVar3 = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar, i14, iVar3);
                    }
                    nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                    g1.o q10 = androidx.compose.foundation.layout.a.q(lVar, -56, 52);
                    rVar.b0(-483455358);
                    l1 a10 = b0.y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                    rVar.b0(-1323940314);
                    int i15 = rVar.P;
                    r1 o11 = rVar.o();
                    b1.c j11 = androidx.compose.ui.layout.a.j(q10);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, a10, iVar);
                        t0.t.v0(rVar, o11, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                            nn.d.s(i15, rVar, i15, iVar3);
                        }
                        nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                        i(t0.t.I0(androidx.compose.foundation.layout.a.x(new HorizontalAlignElement(g1.a.f16393o), s0.g.f34069a, s0.g.f34069a, 16, s0.g.f34069a, 11), 1.0f), rVar, 0, 0);
                        pp.b.b(androidx.compose.foundation.layout.a.r(lVar, s0.g.f34069a, (float) (-1.8d), 1), h0.h.b(12), w0.e(R.color.black_1A1A1A, rVar), androidx.compose.foundation.a.a(w0.e(R.color.grey_A3A3A3, rVar), (float) 1.5d), s0.g.f34069a, b1.d.c(-214396313, new be.b(text, 18), rVar), rVar, 1572870, 40);
                        v.e.y(rVar, false, true, false, false);
                        v.e.y(rVar, false, true, false, false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new yb.j(text, i10, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(th.b r12, boolean r13, kotlin.jvm.functions.Function1 r14, t0.n r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.o(th.b, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final void p(th.b scratchCard, n nVar, int i10) {
        int i11;
        r rVar;
        int i12;
        Intrinsics.checkNotNullParameter(scratchCard, "scratchCard");
        r rVar2 = (r) nVar;
        rVar2.c0(2115113014);
        if ((i10 & 14) == 0) {
            if (rVar2.h(scratchCard)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            Intrinsics.checkNotNullParameter("confetti_coin.json", "assetName");
            n9.o V = o.V(new p("confetti_coin.json"), rVar2, 6);
            Intrinsics.checkNotNullParameter("prepzone_rupee_icon.json", "assetName");
            n9.o V2 = o.V(new p("prepzone_rupee_icon.json"), rVar2, 6);
            q1.b u10 = w0.u(R.drawable.scractched_card_background, rVar2, 6);
            l lVar = l.f16404b;
            float f10 = 6;
            g1.o k10 = androidx.compose.foundation.a.k(h2.l.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.m(lVar, 200), h0.h.b(f10)), false, vh.b.f38058l), vh.e.f38068b, 7);
            rVar2.b0(733328855);
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
            rVar2.b0(-1323940314);
            int i13 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(k10);
            boolean z10 = rVar2.f35166a instanceof t0.f;
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                i iVar = c2.k.f7749e;
                t0.t.v0(rVar2, c10, iVar);
                i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar2, o10, iVar2);
                i iVar3 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar2, i13, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
                androidx.compose.foundation.a.c(u10, "ScratchCellBackground", fillElement, null, null, s0.g.f34069a, null, rVar2, 440, 120);
                bl.j.f((j9.i) V.getValue(), androidx.compose.ui.draw.a.b(fillElement, h0.h.b(f10)), false, true, s0.g.f34069a, 100, false, false, false, null, false, false, null, null, false, null, rVar2, 1575944, 0, 262068);
                g1.o t10 = androidx.compose.foundation.layout.a.t(fillElement, 16);
                g1.e eVar = g1.a.f16392n;
                b0.g gVar = b0.n.f2939e;
                rVar2.b0(-483455358);
                l1 a10 = b0.y.a(gVar, eVar, rVar2, 54);
                rVar2.b0(-1323940314);
                int i14 = rVar2.P;
                r1 o11 = rVar2.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(t10);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a10, iVar);
                    t0.t.v0(rVar2, o11, iVar2);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar2, i14, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                    bl.j.f((j9.i) V2.getValue(), androidx.compose.foundation.layout.d.m(lVar, 64), false, true, s0.g.f34069a, 100, false, false, false, null, false, false, null, null, false, null, rVar2, 1575992, 0, 262068);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar2);
                    String str = scratchCard.f36082c;
                    o2.v vVar = jh.c.f21375d;
                    o2.v vVar2 = jh.c.f21373b;
                    b9.c(jh.b.b(str, vVar, vVar2), null, 0L, 0L, null, null, null, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, new g0(w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(16), null, vVar2, 0, 0L, null, 16777180), rVar2, 0, 0, 130558);
                    rVar = rVar2;
                    v.e.y(rVar, false, true, false, false);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(i10, 18, scratchCard);
        }
    }

    public static final void q(pg.c cVar, List filterOptions, Function1 function1, n nVar, int i10, int i11) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(filterOptions, "filterOptions");
        r rVar = (r) nVar;
        rVar.c0(1668648167);
        if ((i11 & 4) != 0) {
            function12 = pg.t.f31082a;
        } else {
            function12 = function1;
        }
        pp.b.b(androidx.compose.foundation.layout.d.e(l.f16404b, 1.0f), h0.h.a(10, 10), 0L, null, s0.g.f34069a, b1.d.c(2019505764, new v.y((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b), filterOptions, cVar, function12, 4), rVar), rVar, 1572870, 60);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 25, cVar, filterOptions, function12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r(th.b r23, boolean r24, kotlin.jvm.functions.Function1 r25, t0.n r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.r(th.b, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final boolean s(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!Intrinsics.a(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static final String t(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static Collection u(Collection collection) {
        if ((collection instanceof ju.a) && !(collection instanceof ju.b)) {
            k0(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e10) {
            Intrinsics.h(f.class.getName(), e10);
            throw e10;
        }
    }

    public static List v(List list) {
        if ((list instanceof ju.a) && !(list instanceof ju.c)) {
            k0(list, "kotlin.collections.MutableList");
            throw null;
        }
        return list;
    }

    public static Map w(AbstractMap abstractMap) {
        if ((abstractMap instanceof ju.a) && !(abstractMap instanceof ju.d)) {
            k0(abstractMap, "kotlin.collections.MutableMap");
            throw null;
        }
        return abstractMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = Z(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean x(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = y(r9, r10, r11)
            boolean r1 = y(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = Z(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.f.x(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean y(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static void z(int i10, Object obj) {
        if (obj != null && !S(i10, obj)) {
            k0(obj, "kotlin.jvm.functions.Function" + i10);
            throw null;
        }
    }
}
