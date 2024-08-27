package hl;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.ExtractedText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv.b0;
import bv.e0;
import bv.i0;
import bv.j0;
import bv.k0;
import c2.e1;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import cv.i;
import d2.h3;
import d2.s1;
import d4.m1;
import d4.n1;
import d4.v1;
import d4.y0;
import i0.g2;
import iu.v;
import iu.z;
import j2.g0;
import j2.t;
import j2.x;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import jr.h;
import k2.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.w;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import l0.p0;
import m.s;
import n1.w0;
import o2.a0;
import o2.d0;
import o2.l0;
import o2.n0;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q3.m;
import qu.c0;
import qu.f0;
import qu.o1;
import qu.q1;
import qu.t0;
import qu.y1;
import t0.m2;
import t0.r;
import t0.r1;
import t0.x1;
import u2.n;
import u2.o;
import u2.p;
import u2.q;
import u3.l;
import vu.y;
import w2.k;
import yk.j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f18615a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f18616b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f18617c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f18618d;

    public static final void A(f0 f0Var, CancellationException cancellationException) {
        o1 o1Var = (o1) f0Var.H().g(c0.f32192b);
        if (o1Var != null) {
            o1Var.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + f0Var).toString());
        }
    }

    public static final int A0(int i10, float f10, int i11) {
        return i10 + ((int) Math.round((i11 - i10) * f10));
    }

    public static void B(CoroutineContext coroutineContext) {
        Sequence n10;
        o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
        if (o1Var != null && (n10 = o1Var.n()) != null) {
            Iterator it = n10.iterator();
            while (it.hasNext()) {
                ((o1) it.next()).a(null);
            }
        }
    }

    public static final a B0(a x10, int i10) {
        int i11;
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.f18584a;
            int i12 = 0;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = (i14 - i10) + 1;
            a aVar = new a(new int[]{i13, i16, i15});
            float[] fArr = x10.f18586c;
            float[] fArr2 = aVar.f18586c;
            if (i13 > 0) {
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i15 > 0) {
                        int i19 = i12;
                        while (true) {
                            int i20 = i19 + 1;
                            if (i16 > 0) {
                                int i21 = i12;
                                while (true) {
                                    int i22 = i21 + 1;
                                    int i23 = i21 * i15;
                                    int i24 = (i17 * i16 * i15) + i23 + i19;
                                    int i25 = (i17 * i14 * i15) + i23 + i19;
                                    fArr2[i24] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i26 = 0;
                                        while (true) {
                                            int i27 = i26 + 1;
                                            i11 = i14;
                                            fArr2[i24] = Math.max(fArr2[i24], fArr[(i26 * i15) + i25]);
                                            if (i27 >= i10) {
                                                break;
                                            }
                                            i26 = i27;
                                            i14 = i11;
                                        }
                                    } else {
                                        i11 = i14;
                                    }
                                    if (i22 >= i16) {
                                        break;
                                    }
                                    i21 = i22;
                                    i14 = i11;
                                }
                            } else {
                                i11 = i14;
                            }
                            if (i20 >= i15) {
                                break;
                            }
                            i19 = i20;
                            i14 = i11;
                            i12 = 0;
                        }
                    } else {
                        i11 = i14;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                    i17 = i18;
                    i14 = i11;
                    i12 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    public static final void C(int i10) {
        if (i10 >= 1) {
        } else {
            throw new IllegalArgumentException(h.n("Expected positive parallelism level, but got ", i10).toString());
        }
    }

    public static MappedByteBuffer C0(Context context, Uri uri) {
        try {
            ParcelFileDescriptor a10 = l.a(context.getContentResolver(), uri, MatchIndex.ROOT_VALUE, null);
            if (a10 == null) {
                if (a10 != null) {
                    a10.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a10.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a10.close();
                    return map;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    a10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static int D(Context context, String str) {
        int c10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = q3.l.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && c4.c.a(packageName2, packageName)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c11 = m.c(context);
                    c10 = m.a(c11, d10, Binder.getCallingUid(), packageName);
                    if (c10 == 0) {
                        c10 = m.a(c11, d10, myUid, m.b(context));
                    }
                } else {
                    c10 = q3.l.c((AppOpsManager) q3.l.a(context, AppOpsManager.class), d10, packageName);
                }
            } else {
                c10 = q3.l.c((AppOpsManager) q3.l.a(context, AppOpsManager.class), d10, packageName);
            }
            if (c10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final a D0(a x10, a w10) {
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int i10 = 0;
            int i11 = x10.f18584a[0];
            int[] iArr = w10.f18584a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            a aVar = new a(new int[]{i11, i13});
            float[] fArr = x10.f18586c;
            float[] fArr2 = w10.f18586c;
            float[] fArr3 = aVar.f18586c;
            if (i11 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i13 > 0) {
                        int i16 = i10;
                        while (true) {
                            int i17 = i16 + 1;
                            int i18 = (i14 * i13) + i16;
                            fArr3[i18] = 0.0f;
                            if (i12 > 0) {
                                int i19 = i10;
                                while (true) {
                                    int i20 = i19 + 1;
                                    fArr3[i18] = (fArr[(i14 * i12) + i19] * fArr2[(i19 * i13) + i16]) + fArr3[i18];
                                    if (i20 >= i12) {
                                        break;
                                    }
                                    i19 = i20;
                                }
                            }
                            if (i17 >= i13) {
                                break;
                            }
                            i16 = i17;
                            i10 = 0;
                        }
                    }
                    if (i15 >= i11) {
                        break;
                    }
                    i14 = i15;
                    i10 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    public static float E(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static TypedArray E0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static int F(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static final long F0(int i10, int i11, long j10) {
        int j11 = w2.a.j(j10) + i10;
        int i12 = 0;
        if (j11 < 0) {
            j11 = 0;
        }
        int h10 = w2.a.h(j10);
        if (h10 != Integer.MAX_VALUE && (h10 = h10 + i10) < 0) {
            h10 = 0;
        }
        int i13 = w2.a.i(j10) + i11;
        if (i13 < 0) {
            i13 = 0;
        }
        int g10 = w2.a.g(j10);
        if (g10 != Integer.MAX_VALUE) {
            int i14 = g10 + i11;
            if (i14 >= 0) {
                i12 = i14;
            }
            g10 = i12;
        }
        return b(j11, h10, i13, g10);
    }

    public static void G(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static t3.e G0(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        boolean z10;
        int i11;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p3.a.f30622b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        W0(xmlResourceParser);
                    }
                    return new t3.h(new s(string, string2, string3, I0(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p3.a.f30623c);
                            int i12 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i12 = 1;
                            }
                            int i13 = obtainAttributes2.getInt(i12, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i10 = 6;
                            } else {
                                i10 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i10, 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i14 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i14 = 3;
                            }
                            int i15 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i15 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i15);
                            int i16 = obtainAttributes2.getInt(i14, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i11 = 5;
                            } else {
                                i11 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                            String string6 = obtainAttributes2.getString(i11);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                W0(xmlResourceParser);
                            }
                            arrayList.add(new t3.g(i13, i16, resourceId2, string6, string5, z10));
                        } else {
                            W0(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new t3.f((t3.g[]) arrayList.toArray(new t3.g[0]));
                }
            } else {
                W0(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final a H(a[] tensors) {
        int i10;
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i11 = 0;
            int i12 = tensors[0].f18584a[0];
            int length = tensors.length - 1;
            if (length >= 0) {
                int i13 = 0;
                i10 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    i10 += tensors[i13].f18584a[1];
                    if (i14 > length) {
                        break;
                    }
                    i13 = i14;
                }
            } else {
                i10 = 0;
            }
            a aVar = new a(new int[]{i12, i10});
            float[] fArr = aVar.f18586c;
            if (i12 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    int i17 = i15 * i10;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i18 = i11;
                        while (true) {
                            int i19 = i18 + 1;
                            a aVar2 = tensors[i18];
                            float[] fArr2 = aVar2.f18586c;
                            int i20 = aVar2.f18584a[1];
                            System.arraycopy(fArr2, i15 * i20, fArr, i17, i20);
                            i17 += i20;
                            if (i19 > length2) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    if (i16 >= i12) {
                        break;
                    }
                    i15 = i16;
                    i11 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [iu.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [iu.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [iu.y, java.lang.Object] */
    public static final cv.g H0(e0 e0Var) {
        String str;
        long j10;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        int L = e0Var.L();
        if (L == 33639248) {
            e0Var.skip(4L);
            short O = e0Var.O();
            int i10 = O & 65535;
            if ((O & 1) == 0) {
                int O2 = e0Var.O() & 65535;
                int O3 = e0Var.O() & 65535;
                int O4 = e0Var.O() & 65535;
                long L2 = e0Var.L() & 4294967295L;
                ?? obj = new Object();
                obj.f20559a = e0Var.L() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f20559a = e0Var.L() & 4294967295L;
                int O5 = e0Var.O() & 65535;
                int O6 = e0Var.O() & 65535;
                int O7 = e0Var.O() & 65535;
                e0Var.skip(8L);
                ?? obj3 = new Object();
                obj3.f20559a = e0Var.L() & 4294967295L;
                String b10 = e0Var.b(O5);
                if (!w.t(b10, (char) 0)) {
                    if (obj2.f20559a == 4294967295L) {
                        j10 = 8;
                        str = b10;
                    } else {
                        str = b10;
                        j10 = 0;
                    }
                    if (obj.f20559a == 4294967295L) {
                        j10 += 8;
                    }
                    if (obj3.f20559a == 4294967295L) {
                        j10 += 8;
                    }
                    long j11 = j10;
                    z zVar = new z();
                    z zVar2 = new z();
                    z zVar3 = new z();
                    v vVar = new v();
                    String str2 = str;
                    J0(e0Var, O6, new i(vVar, j11, obj2, e0Var, obj, obj3, zVar, zVar2, zVar3));
                    if (j11 > 0 && !vVar.f20556a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String b11 = e0Var.b(O7);
                    String str3 = b0.f7323b;
                    return new cv.g(gt.d.f("/", false).d(str2), kotlin.text.s.i(str2, "/", false), b11, L2, obj.f20559a, obj2.f20559a, O2, obj3.f20559a, O4, O3, (Long) zVar.f20560a, (Long) zVar2.f20560a, (Long) zVar3.f20560a, 57344);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + i0(i10));
        }
        throw new IOException("bad zip: expected " + i0(33639248) + " but was " + i0(L));
    }

    public static final long I(long j10, long j11) {
        return k(kotlin.ranges.d.f((int) (j11 >> 32), w2.a.j(j10), w2.a.h(j10)), kotlin.ranges.d.f((int) (j11 & 4294967295L), w2.a.i(j10), w2.a.g(j10)));
    }

    public static List I0(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (t3.d.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final long J(long j10, long j11) {
        return b(kotlin.ranges.d.f(w2.a.j(j11), w2.a.j(j10), w2.a.h(j10)), kotlin.ranges.d.f(w2.a.h(j11), w2.a.j(j10), w2.a.h(j10)), kotlin.ranges.d.f(w2.a.i(j11), w2.a.i(j10), w2.a.g(j10)), kotlin.ranges.d.f(w2.a.g(j11), w2.a.i(j10), w2.a.g(j10)));
    }

    public static final void J0(bv.l lVar, int i10, Function2 function2) {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 >= 4) {
                int O = lVar.O() & 65535;
                long O2 = lVar.O() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j11 = j10 - 4;
                if (j11 >= O2) {
                    lVar.W(O2);
                    long j12 = lVar.h().f7365b;
                    function2.invoke(Integer.valueOf(O), Long.valueOf(O2));
                    long j13 = (lVar.h().f7365b + O2) - j12;
                    if (j13 >= 0) {
                        if (j13 > 0) {
                            lVar.h().skip(j13);
                        }
                        j10 = j11 - O2;
                    } else {
                        throw new IOException(h.n("unsupported zip: too many bytes processed for ", O));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final int K(int i10, long j10) {
        return kotlin.ranges.d.f(i10, w2.a.i(j10), w2.a.g(j10));
    }

    public static final cv.g K0(e0 e0Var, cv.g gVar) {
        int L = e0Var.L();
        if (L == 67324752) {
            e0Var.skip(2L);
            short O = e0Var.O();
            int i10 = O & 65535;
            if ((O & 1) == 0) {
                e0Var.skip(18L);
                long O2 = e0Var.O() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int O3 = e0Var.O() & 65535;
                e0Var.skip(O2);
                if (gVar == null) {
                    e0Var.skip(O3);
                    return null;
                }
                z zVar = new z();
                z zVar2 = new z();
                z zVar3 = new z();
                J0(e0Var, O3, new cv.h(e0Var, zVar, zVar2, zVar3));
                return new cv.g(gVar.f13094a, gVar.f13095b, gVar.f13096c, gVar.f13097d, gVar.f13098e, gVar.f13099f, gVar.f13100g, gVar.f13101h, gVar.f13102i, gVar.f13103j, gVar.f13104k, gVar.f13105l, gVar.f13106m, (Integer) zVar.f20560a, (Integer) zVar2.f20560a, (Integer) zVar3.f20560a);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + i0(i10));
        }
        throw new IOException("bad zip: expected " + i0(67324752) + " but was " + i0(L));
    }

    public static final int L(int i10, long j10) {
        return kotlin.ranges.d.f(i10, w2.a.j(j10), w2.a.h(j10));
    }

    public static final void L0(a x10) {
        if (sl.a.b(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            float[] fArr = x10.f18586c;
            int length = fArr.length - 1;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (fArr[i10] < s0.g.f34069a) {
                        fArr[i10] = 0.0f;
                    }
                    if (i11 <= length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
        }
    }

    public static final a M(a x10, a w10) {
        Class<f> cls;
        a aVar;
        Class<f> cls2 = f.class;
        if (sl.a.b(cls2)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            int[] iArr = x10.f18584a;
            int i10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int[] iArr2 = w10.f18584a;
            int i14 = iArr2[0];
            int i15 = (i12 - i14) + 1;
            int i16 = iArr2[2];
            a aVar2 = new a(new int[]{i11, i15, i16});
            float[] fArr = x10.f18586c;
            float[] fArr2 = aVar2.f18586c;
            float[] fArr3 = w10.f18586c;
            if (i11 > 0) {
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i16 > 0) {
                        int i19 = i10;
                        while (true) {
                            int i20 = i19 + 1;
                            if (i15 > 0) {
                                int i21 = 0;
                                while (true) {
                                    int i22 = i21 + 1;
                                    float f10 = s0.g.f34069a;
                                    if (i14 > 0) {
                                        int i23 = 0;
                                        while (true) {
                                            cls = cls2;
                                            int i24 = i23 + 1;
                                            if (i13 > 0) {
                                                int i25 = 0;
                                                while (true) {
                                                    aVar = aVar2;
                                                    int i26 = i25 + 1;
                                                    try {
                                                        f10 = (fArr[((i23 + i21) * i13) + (i12 * i13 * i17) + i25] * fArr3[(((i23 * i13) + i25) * i16) + i19]) + f10;
                                                        if (i26 >= i13) {
                                                            break;
                                                        }
                                                        i25 = i26;
                                                        aVar2 = aVar;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        sl.a.a(cls, th);
                                                        return null;
                                                    }
                                                }
                                            } else {
                                                aVar = aVar2;
                                            }
                                            if (i24 >= i14) {
                                                break;
                                            }
                                            i23 = i24;
                                            cls2 = cls;
                                            aVar2 = aVar;
                                        }
                                    } else {
                                        cls = cls2;
                                        aVar = aVar2;
                                    }
                                    fArr2[(i21 * i16) + (i15 * i16 * i17) + i19] = f10;
                                    if (i22 >= i15) {
                                        break;
                                    }
                                    i21 = i22;
                                    cls2 = cls;
                                    aVar2 = aVar;
                                }
                            } else {
                                cls = cls2;
                                aVar = aVar2;
                            }
                            if (i20 >= i16) {
                                break;
                            }
                            i19 = i20;
                            cls2 = cls;
                            aVar2 = aVar;
                        }
                    } else {
                        cls = cls2;
                        aVar = aVar2;
                    }
                    if (i18 < i11) {
                        i17 = i18;
                        cls2 = cls;
                        aVar2 = aVar;
                        i10 = 0;
                    } else {
                        return aVar;
                    }
                }
            } else {
                return aVar2;
            }
        } catch (Throwable th3) {
            th = th3;
            cls = cls2;
        }
    }

    public static final g0 M0(g0 g0Var, k kVar) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        j2.b0 b0Var = g0Var.f20722a;
        int i14 = j2.c0.f20684e;
        n nVar = b0Var.f20659a;
        nVar.getClass();
        u2.l lVar = u2.l.f36689a;
        if (Intrinsics.a(nVar, lVar)) {
            long j10 = j2.c0.f20683d;
            if (j10 != 16) {
                nVar = new u2.c(j10);
            } else {
                nVar = lVar;
            }
        }
        n nVar2 = nVar;
        long j11 = b0Var.f20660b;
        if (j.g1(j11)) {
            j11 = j2.c0.f20680a;
        }
        long j12 = j11;
        d0 d0Var = b0Var.f20661c;
        if (d0Var == null) {
            d0Var = d0.f29464f;
        }
        d0 d0Var2 = d0Var;
        o2.z zVar = b0Var.f20662d;
        if (zVar != null) {
            i10 = zVar.f29542a;
        } else {
            i10 = 0;
        }
        o2.z zVar2 = new o2.z(i10);
        a0 a0Var = b0Var.f20663e;
        if (a0Var != null) {
            i11 = a0Var.f29453a;
        } else {
            i11 = 1;
        }
        a0 a0Var2 = new a0(i11);
        o2.s sVar = b0Var.f20664f;
        if (sVar == null) {
            sVar = o2.s.f29523a;
        }
        o2.s sVar2 = sVar;
        String str = b0Var.f20665g;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        long j13 = b0Var.f20666h;
        if (j.g1(j13)) {
            j13 = j2.c0.f20681b;
        }
        long j14 = j13;
        u2.a aVar = b0Var.f20667i;
        if (aVar != null) {
            f10 = aVar.f36667a;
        } else {
            f10 = s0.g.f34069a;
        }
        u2.a aVar2 = new u2.a(f10);
        o oVar = b0Var.f20668j;
        if (oVar == null) {
            oVar = o.f36692c;
        }
        o oVar2 = oVar;
        q2.d dVar = b0Var.f20669k;
        if (dVar == null) {
            dVar = q2.f.f31581a.a();
        }
        q2.d dVar2 = dVar;
        long j15 = b0Var.f20670l;
        if (j15 == 16) {
            j15 = j2.c0.f20682c;
        }
        long j16 = j15;
        u2.j jVar = b0Var.f20671m;
        if (jVar == null) {
            jVar = u2.j.f36684b;
        }
        u2.j jVar2 = jVar;
        w0 w0Var = b0Var.f20672n;
        if (w0Var == null) {
            w0Var = w0.f28204d;
        }
        w0 w0Var2 = w0Var;
        j2.w wVar = b0Var.f20673o;
        p1.i iVar = b0Var.f20674p;
        if (iVar == null) {
            iVar = p1.k.f30509a;
        }
        j2.b0 b0Var2 = new j2.b0(nVar2, j12, d0Var2, zVar2, a0Var2, sVar2, str2, j14, aVar2, oVar2, dVar2, j16, jVar2, w0Var2, wVar, iVar);
        int i15 = t.f20765b;
        j2.s sVar3 = g0Var.f20723b;
        int i16 = 5;
        if (u2.i.b(sVar3.f20755a, Integer.MIN_VALUE)) {
            i12 = 5;
        } else {
            i12 = sVar3.f20755a;
        }
        int i17 = sVar3.f20756b;
        if (u2.k.a(i17, 3)) {
            int ordinal = kVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i13 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i16 = 4;
                i13 = 1;
            }
        } else if (u2.k.a(i17, Integer.MIN_VALUE)) {
            int ordinal2 = kVar.ordinal();
            if (ordinal2 != 0) {
                i13 = 1;
                if (ordinal2 == 1) {
                    i16 = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i13 = 1;
                i16 = 1;
            }
        } else {
            i13 = 1;
            i16 = i17;
        }
        long j17 = sVar3.f20757c;
        if (j.g1(j17)) {
            j17 = t.f20764a;
        }
        p pVar = sVar3.f20758d;
        if (pVar == null) {
            pVar = p.f36695c;
        }
        j2.v vVar = sVar3.f20759e;
        u2.g gVar = sVar3.f20760f;
        int i18 = sVar3.f20761g;
        if (i18 == 0) {
            i18 = u2.e.f36672b;
        }
        int i19 = sVar3.f20762h;
        if (u2.d.a(i19, Integer.MIN_VALUE)) {
            i19 = i13;
        }
        q qVar = sVar3.f20763i;
        if (qVar == null) {
            qVar = q.f36698c;
        }
        return new g0(b0Var2, new j2.s(i12, i16, j17, pVar, vVar, gVar, i18, i19, qVar), g0Var.f20724c);
    }

    public static boolean N(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean O = O(inputStream, file);
            G(inputStream);
            return O;
        } catch (Throwable th3) {
            th = th3;
            G(inputStream);
            throw th;
        }
    }

    public static final float N0(long j10, float f10, w2.b bVar) {
        float c10;
        long b10 = w2.m.b(j10);
        if (w2.n.a(b10, 4294967296L)) {
            if (bVar.Y() > 1.05d) {
                c10 = w2.m.c(j10) / w2.m.c(bVar.H(f10));
            } else {
                return bVar.x0(j10);
            }
        } else if (w2.n.a(b10, 8589934592L)) {
            c10 = w2.m.c(j10);
        } else {
            return Float.NaN;
        }
        return c10 * f10;
    }

    public static boolean O(InputStream inputStream, File file) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            G(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    G(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    G(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static final void O0(TextPaint textPaint, float f10) {
        if (!Float.isNaN(f10)) {
            if (f10 < s0.g.f34069a) {
                f10 = 0.0f;
            }
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f10 * 255));
        }
    }

    public static final Object P(Function2 function2, yt.a frame) {
        y yVar = new y(frame, frame.getContext());
        Object b12 = b1(yVar, yVar, function2);
        if (b12 == zt.a.f42823a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return b12;
    }

    public static final void P0(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            spannable.setSpan(new ForegroundColorSpan(androidx.compose.ui.graphics.a.y(j10)), i10, i11, 33);
        }
    }

    public static final long Q(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (i13 == Integer.MAX_VALUE) {
            i14 = i12;
        } else {
            i14 = i13;
        }
        int t10 = t(i14);
        if (i11 == Integer.MAX_VALUE) {
            i15 = i10;
        } else {
            i15 = i11;
        }
        int t11 = t(i15);
        if (t10 + t11 <= 31) {
            int i16 = i11 + 1;
            int i17 = i16 & (~(i16 >> 31));
            int i18 = i13 + 1;
            int i19 = i18 & (~(i18 >> 31));
            int i20 = 0;
            if (t11 != 13) {
                if (t11 != 18) {
                    if (t11 != 15) {
                        if (t11 == 16) {
                            i20 = 2;
                        }
                    } else {
                        i20 = 1;
                    }
                } else {
                    i20 = 3;
                }
            }
            int i21 = (((i20 & 2) >> 1) * 3) + ((i20 & 1) << 1);
            return (i17 << 33) | i20 | (i10 << 2) | (i12 << (i21 + 15)) | (i19 << (i21 + 46));
        }
        throw new IllegalArgumentException("Can't represent a width of " + i15 + " and height of " + i14 + " in Constraints");
    }

    public static final void Q0(Spannable spannable, long j10, w2.b bVar, int i10, int i11) {
        long b10 = w2.m.b(j10);
        if (w2.n.a(b10, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ku.c.b(bVar.x0(j10)), false), i10, i11, 33);
        } else if (w2.n.a(b10, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(w2.m.c(j10)), i10, i11, 33);
        }
    }

    public static final a R(a x10, a w10, a b10) {
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(w10, "w");
            Intrinsics.checkNotNullParameter(b10, "b");
            int i10 = x10.f18584a[0];
            int i11 = b10.f18584a[0];
            a D0 = D0(x10, w10);
            float[] fArr = b10.f18586c;
            float[] fArr2 = D0.f18586c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            int i16 = (i12 * i11) + i14;
                            fArr2[i16] = fArr2[i16] + fArr[i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return D0;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    public static final Typeface R0(Typeface typeface, o2.c0 c0Var, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            ThreadLocal threadLocal = n0.f29513a;
            if (typeface == null) {
                return null;
            }
            if (!c0Var.f29458a.isEmpty()) {
                ThreadLocal threadLocal2 = n0.f29513a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setTypeface(typeface);
                n1.z.q(paint, j.T0(c0Var.f29458a, null, new e1(j.n(context), 7), 31));
                return paint.getTypeface();
            }
            return typeface;
        }
        return typeface;
    }

    public static final float S(int i10, t0.n nVar) {
        r rVar = (r) nVar;
        return ((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b)).getResources().getDimension(i10) / ((w2.b) rVar.m(s1.f13620e)).b();
    }

    public static void S0(int i10, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        T0(0, context, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, d4.m1] */
    public static boolean T(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = n1.f13788a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = m1.f13780d;
        m1 m1Var = (m1) view.getTag(R.id.tag_unhandled_key_event_manager);
        m1 m1Var2 = m1Var;
        if (m1Var == null) {
            ?? obj = new Object();
            obj.f13781a = null;
            obj.f13782b = null;
            obj.f13783c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            m1Var2 = obj;
        }
        WeakReference weakReference2 = m1Var2.f13783c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        m1Var2.f13783c = new WeakReference(keyEvent);
        if (m1Var2.f13782b == null) {
            m1Var2.f13782b = new SparseArray();
        }
        SparseArray sparseArray = m1Var2.f13782b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !y0.b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        a3.a.u(arrayList.get(size));
        throw null;
    }

    public static void T0(int i10, Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return;
        }
        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, i10);
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.message)).setText(text);
        makeText.setView(inflate);
        makeText.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean U(d4.p r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = hl.f.f18615a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            hl.f.f18616b = r0     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            hl.f.f18615a = r3
        L4c:
            java.lang.reflect.Method r0 = hl.f.f18616b
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = r0.invoke(r8, r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L5b
            goto L64
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L64
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = d4.n1.c(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = hl.f.f18617c
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            hl.f.f18618d = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            hl.f.f18617c = r3
        L9a:
            java.lang.reflect.Field r7 = hl.f.f18618d
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = d4.n1.c(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = d4.n1.c(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.f.U(d4.p, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static void U0(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        T0(10, context, string);
    }

    public static final a V(String[] texts, a w10) {
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w10, "w");
            int length = texts.length;
            int i10 = w10.f18584a[1];
            a aVar = new a(new int[]{length, 128, i10});
            float[] fArr = aVar.f18586c;
            float[] fArr2 = w10.f18586c;
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int[] c10 = g.f18619a.c(texts[i11]);
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        System.arraycopy(fArr2, c10[i13] * i10, fArr, (i13 * i10) + (i10 * 128 * i11), i10);
                        if (i14 >= 128) {
                            break;
                        }
                        i13 = i14;
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    public static final i0 V0(Socket socket) {
        Logger logger = bv.z.f7404a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        j0 j0Var = new j0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return j0Var.sink(new bv.d(outputStream, j0Var));
    }

    public static final void W(CoroutineContext coroutineContext) {
        o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
        if (o1Var != null && !o1Var.b()) {
            throw o1Var.v();
        }
    }

    public static void W0(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i10--;
                }
            } else {
                i10++;
            }
        }
    }

    public static final boolean X(int i10, int i11) {
        return i10 == i11;
    }

    public static final void X0(a x10) {
        if (sl.a.b(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.f18584a;
            int i10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            float[] fArr = x10.f18586c;
            if (i11 <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                int i14 = i10 * i12;
                int i15 = i14 + i12;
                float f10 = Float.MIN_VALUE;
                if (i14 < i15) {
                    int i16 = i14;
                    while (true) {
                        int i17 = i16 + 1;
                        float f11 = fArr[i16];
                        if (f11 > f10) {
                            f10 = f11;
                        }
                        if (i17 >= i15) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                float f12 = s0.g.f34069a;
                if (i14 < i15) {
                    int i18 = i14;
                    while (true) {
                        int i19 = i18 + 1;
                        float exp = (float) Math.exp(fArr[i18] - f10);
                        fArr[i18] = exp;
                        f12 += exp;
                        if (i19 >= i15) {
                            break;
                        } else {
                            i18 = i19;
                        }
                    }
                }
                if (i14 < i15) {
                    while (true) {
                        int i20 = i14 + 1;
                        fArr[i14] = fArr[i14] / f12;
                        if (i20 >= i15) {
                            break;
                        } else {
                            i14 = i20;
                        }
                    }
                }
                if (i13 < i11) {
                    i10 = i13;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
        }
    }

    public static final float Y(float f10) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = intBitsToFloat - ((intBitsToFloat - (f10 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final bv.e Y0(File file) {
        Logger logger = bv.z.f7404a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new bv.e(new FileInputStream(file), bv.n0.NONE);
    }

    public static final androidx.navigation.t Z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.navigation.t tVar = (androidx.navigation.t) pu.p.f(pu.p.h(pu.m.d(androidx.navigation.c.f2169k, view), androidx.navigation.c.f2170l));
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bv.n0, java.lang.Object] */
    public static final bv.e Z0(InputStream inputStream) {
        Logger logger = bv.z.f7404a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new bv.e(inputStream, (bv.n0) new Object());
    }

    public static su.c a(int i10, su.a aVar, int i11) {
        su.c lVar;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = su.a.f34776a;
        }
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        if (aVar == su.a.f34776a) {
                            return new su.c(i10, null);
                        }
                        return new su.l(i10, aVar, null);
                    }
                    return new su.c(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
                }
                if (aVar == su.a.f34776a) {
                    lVar = new su.c(0, null);
                } else {
                    lVar = new su.l(1, aVar, null);
                }
            } else {
                if (aVar == su.a.f34776a) {
                    return new su.l(1, su.a.f34777b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (aVar == su.a.f34776a) {
            su.g.W.getClass();
            lVar = new su.c(su.f.f34815b, null);
        } else {
            lVar = new su.l(1, aVar, null);
        }
        return lVar;
    }

    public static final int a0(int i10, ArrayList arrayList) {
        char c10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            j2.p pVar = (j2.p) arrayList.get(i12);
            if (pVar.f20746b > i10) {
                c10 = 1;
            } else if (pVar.f20747c <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final k0 a1(Socket socket) {
        Logger logger = bv.z.f7404a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        j0 j0Var = new j0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return j0Var.source(new bv.e(inputStream, j0Var));
    }

    public static final long b(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i13 >= i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 >= 0 && i12 >= 0) {
                    z12 = true;
                }
                if (z12) {
                    return Q(i10, i11, i12, i13);
                }
                j.A1("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
                throw null;
            }
            j.A1("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
            throw null;
        }
        j.A1("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
        throw null;
    }

    public static final int b0(int i10, ArrayList arrayList) {
        char c10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            j2.p pVar = (j2.p) arrayList.get(i12);
            if (pVar.f20748d > i10) {
                c10 = 1;
            } else if (pVar.f20749e <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final Object b1(y yVar, y yVar2, Function2 function2) {
        Object tVar;
        Object a02;
        try {
            zq.f.z(2, function2);
            tVar = function2.invoke(yVar2, yVar);
        } catch (Throwable th2) {
            tVar = new qu.t(th2, false);
        }
        zt.a aVar = zt.a.f42823a;
        if (tVar != aVar && (a02 = yVar.a0(tVar)) != y1.f32302b) {
            if (!(a02 instanceof qu.t)) {
                return y1.a(a02);
            }
            throw ((qu.t) a02).f32267a;
        }
        return aVar;
    }

    public static /* synthetic */ long c(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return b(0, i10, 0, i11);
    }

    public static final int c0(ArrayList arrayList, float f10) {
        char c10;
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            j2.p pVar = (j2.p) arrayList.get(i11);
            if (pVar.f20750f > f10) {
                c10 = 1;
            } else if (pVar.f20751g <= f10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final String c1(int i10, t0.n nVar) {
        return d2.w0.w(nVar).getString(i10);
    }

    public static final vu.f d(CoroutineContext coroutineContext) {
        if (coroutineContext.g(c0.f32192b) == null) {
            coroutineContext = coroutineContext.l(l());
        }
        return new vu.f(coroutineContext);
    }

    public static final void d0(ArrayList arrayList, long j10, Function1 function1) {
        int size = arrayList.size();
        for (int a02 = a0(j2.f0.e(j10), arrayList); a02 < size; a02++) {
            j2.p pVar = (j2.p) arrayList.get(a02);
            if (pVar.f20746b < j2.f0.d(j10)) {
                if (pVar.f20746b != pVar.f20747c) {
                    function1.invoke(pVar);
                }
            } else {
                return;
            }
        }
    }

    public static final String d1(int i10, Object[] objArr, t0.n nVar) {
        return d2.w0.w(nVar).getString(i10, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(kotlin.jvm.functions.Function0 r20, z2.o r21, kotlin.jvm.functions.Function2 r22, t0.n r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.f.e(kotlin.jvm.functions.Function0, z2.o, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void e0(a x10) {
        int i10;
        if (sl.a.b(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.f18584a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i11 = 1;
                i10 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    i10 *= x10.f18584a[i11];
                    if (i12 >= length) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            } else {
                i10 = 1;
            }
            int[] shape = {x10.f18584a[0], i10};
            Intrinsics.checkNotNullParameter(shape, "shape");
            x10.f18584a = shape;
            int i13 = a.f18583d;
            int b10 = ek.e.b(shape);
            float[] fArr = new float[b10];
            System.arraycopy(x10.f18586c, 0, fArr, 0, Math.min(x10.f18585b, b10));
            x10.f18586c = fArr;
            x10.f18585b = b10;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e1(java.lang.Exception r5, yt.a r6) {
        /*
            boolean r0 = r6 instanceof nv.y
            if (r0 == 0) goto L13
            r0 = r6
            nv.y r0 = (nv.y) r0
            int r1 = r0.f29321b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29321b = r1
            goto L18
        L13:
            nv.y r0 = new nv.y
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29320a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f29321b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ut.n.b(r6)
            kotlin.Unit r5 = kotlin.Unit.f23355a
            return r5
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ut.n.b(r6)
            r0.getClass()
            r0.f29321b = r3
            xu.e r6 = qu.r0.f32255a
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            m.j r3 = new m.j
            r4 = 28
            r3.<init>(r0, r5, r4)
            r6.b0(r2, r3)
            java.lang.String r5 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.f.e1(java.lang.Exception, yt.a):java.lang.Object");
    }

    public static final long f(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = w2.f.f38785c;
        return floatToRawIntBits;
    }

    public static final String f0(String codeVerifier) {
        wl.a codeChallengeMethod = wl.a.f39146a;
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (y0(codeVerifier)) {
            try {
                byte[] bytes = codeVerifier.getBytes(Charsets.f23386b);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new FacebookException("Invalid Code Verifier.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f1(int r7, java.lang.Object r8, o2.q r9, o2.d0 r10, int r11) {
        /*
            boolean r0 = r8 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r8
        L5:
            r0 = 1
            boolean r1 = o2.a0.a(r7, r0)
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L14
            boolean r1 = o2.a0.a(r7, r2)
            if (r1 == 0) goto L35
        L14:
            r1 = r9
            o2.l0 r1 = (o2.l0) r1
            o2.d0 r4 = r1.f29506b
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r4, r10)
            if (r4 != 0) goto L35
            o2.d0 r4 = o2.d0.f29462d
            int r5 = r10.compareTo(r4)
            if (r5 < 0) goto L35
            o2.d0 r1 = r1.f29506b
            int r1 = r1.f29469a
            int r4 = r4.f29469a
            int r1 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            if (r1 >= 0) goto L35
            r1 = r0
            goto L36
        L35:
            r1 = r3
        L36:
            boolean r4 = o2.a0.a(r7, r0)
            r5 = 3
            if (r4 != 0) goto L43
            boolean r7 = o2.a0.a(r7, r5)
            if (r7 == 0) goto L50
        L43:
            r7 = r9
            o2.l0 r7 = (o2.l0) r7
            int r7 = r7.f29507c
            boolean r7 = o2.z.a(r11, r7)
            if (r7 != 0) goto L50
            r7 = r0
            goto L51
        L50:
            r7 = r3
        L51:
            if (r7 != 0) goto L56
            if (r1 != 0) goto L56
            return r8
        L56:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 >= r6) goto L7c
            if (r7 == 0) goto L66
            boolean r7 = o2.z.a(r11, r0)
            if (r7 == 0) goto L66
            r7 = r0
            goto L67
        L66:
            r7 = r3
        L67:
            if (r7 == 0) goto L6d
            if (r1 == 0) goto L6d
            r0 = r5
            goto L75
        L6d:
            if (r1 == 0) goto L70
            goto L75
        L70:
            if (r7 == 0) goto L74
            r0 = r2
            goto L75
        L74:
            r0 = r3
        L75:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r8, r0)
            goto L9f
        L7c:
            if (r1 == 0) goto L81
            int r10 = r10.f29469a
            goto L88
        L81:
            r10 = r9
            o2.l0 r10 = (o2.l0) r10
            o2.d0 r10 = r10.f29506b
            int r10 = r10.f29469a
        L88:
            if (r7 == 0) goto L8f
            boolean r7 = o2.z.a(r11, r0)
            goto L97
        L8f:
            o2.l0 r9 = (o2.l0) r9
            int r7 = r9.f29507c
            boolean r7 = o2.z.a(r7, r0)
        L97:
            o2.o0 r9 = o2.o0.f29514a
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            android.graphics.Typeface r7 = r9.a(r8, r10, r7)
        L9f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.f.f1(int, java.lang.Object, o2.q, o2.d0, int):java.lang.Object");
    }

    public static final long g(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = w2.g.f38789d;
        return floatToRawIntBits;
    }

    public static final float g0(Layout layout, int i10, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        k2.s sVar = u.f21976a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= s0.g.f34069a) {
            return s0.g.f34069a;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment != null && m2.d.f27257a[paragraphAlignment.ordinal()] == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static Bitmap g1(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) {
                    return bitmapDrawable.getBitmap();
                }
                return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i10 = bounds.left;
        int i11 = bounds.top;
        int i12 = bounds.right;
        int i13 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i10, i11, i12, i13);
        return createBitmap;
    }

    public static l0 h(int i10) {
        return new l0(i10, d0.f29464f, 0, new o2.c0(new o2.b0[0]), 0);
    }

    public static final float h0(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        k2.s sVar = u.f21976a;
        if (layout.getEllipsisCount(i10) > 0 && layout.getParagraphDirection(i10) == -1 && layout.getWidth() < layout.getLineRight(i10)) {
            float measureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
            if (paragraphAlignment != null && m2.d.f27257a[paragraphAlignment.ordinal()] == 1) {
                width = layout.getWidth() - layout.getLineRight(i10);
                width2 = (layout.getWidth() - measureText) / 2.0f;
            } else {
                width = layout.getWidth() - layout.getLineRight(i10);
                width2 = layout.getWidth() - measureText;
            }
            return width - width2;
        }
        return s0.g.f34069a;
    }

    public static final ExtractedText h1(p2.c0 c0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0Var.f30522a.f20699a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = c0Var.f30523b;
        extractedText.selectionStart = j2.f0.e(j10);
        extractedText.selectionEnd = j2.f0.d(j10);
        extractedText.flags = !w.t(c0Var.f30522a.f20699a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final o2.v i(o2.q... qVarArr) {
        return new o2.v(vt.t.b(qVarArr));
    }

    public static final String i0(int i10) {
        StringBuilder sb2 = new StringBuilder("0x");
        String num = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }

    public static final long i1(long j10) {
        return t0.t.j((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final long j(int i10, int i11) {
        long j10 = (i11 & 4294967295L) | (i10 << 32);
        int i12 = w2.h.f38792c;
        return j10;
    }

    public static final o1 j0(CoroutineContext coroutineContext) {
        o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
        if (o1Var != null) {
            return o1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static String j1(int i10) {
        if (X(i10, 0)) {
            return "Blocking";
        }
        if (X(i10, 1)) {
            return "Optional";
        }
        if (X(i10, 2)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public static final long k(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static ColorStateList k0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!r0(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 != 2) {
            if (i10 >= 28 && i10 <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal threadLocal = t3.c.f35301a;
            try {
                return t3.c.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e10) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                return null;
            }
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    public static final a k1(a x10) {
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.f18584a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            a aVar = new a(new int[]{i11, i10});
            float[] fArr = x10.f18586c;
            float[] fArr2 = aVar.f18586c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            fArr2[(i14 * i10) + i12] = fArr[(i12 * i11) + i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    public static q1 l() {
        return new q1(null);
    }

    public static l0.j l0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        l0.j jVar;
        boolean r02 = r0(xmlPullParser, str);
        Object obj = null;
        int i11 = 0;
        if (r02) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new l0.j(typedValue.data, obj, obj);
            }
            try {
                jVar = l0.j.b(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                jVar = null;
            }
            if (jVar != null) {
                return jVar;
            }
        }
        return new l0.j(i11, obj, obj);
    }

    public static final a l1(a x10) {
        if (sl.a.b(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            int[] iArr = x10.f18584a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            a aVar = new a(new int[]{i12, i11, i10});
            float[] fArr = x10.f18586c;
            float[] fArr2 = aVar.f18586c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    fArr2[(i15 * i10) + (i17 * i10 * i11) + i13] = fArr[(i15 * i12) + (i13 * i11 * i12) + i17];
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
            return null;
        }
    }

    public static j2.a m(String str, g0 g0Var, long j10, w2.b bVar, o2.r rVar, vt.i0 i0Var, int i10, int i11) {
        vt.i0 i0Var2;
        vt.i0 i0Var3;
        int i12;
        if ((i11 & 32) != 0) {
            i0Var2 = vt.i0.f38321a;
        } else {
            i0Var2 = i0Var;
        }
        if ((i11 & 64) != 0) {
            i0Var3 = vt.i0.f38321a;
        } else {
            i0Var3 = null;
        }
        vt.i0 i0Var4 = i0Var3;
        if ((i11 & 128) != 0) {
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } else {
            i12 = i10;
        }
        return new j2.a(new r2.c(g0Var, rVar, bVar, str, i0Var2, i0Var4), i12, false, j10);
    }

    public static final Object m0(h2.j jVar, h2.u uVar) {
        Object obj = jVar.f17850a.get(uVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final long n(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = w2.o.f38809c;
        return floatToRawIntBits;
    }

    public static final j4.a n0(View view) {
        j4.a aVar = (j4.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar == null) {
            j4.a aVar2 = new j4.a();
            view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static final void o(g1.o oVar, Function2 function2, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(-1177876616);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.j(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && rVar.G()) {
            rVar.V();
        } else {
            if (i15 != 0) {
                oVar = g1.l.f16404b;
            }
            z2.d dVar = z2.d.f41918b;
            int i16 = ((i12 << 3) & 112) | ((i12 >> 3) & 14) | 384;
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(oVar);
            int i18 = ((i16 << 9) & 7168) | 6;
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, dVar, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q((i18 >> 3) & 112, j10, new m2(rVar), rVar, 2058660585);
                com.google.android.gms.internal.p002firebaseauthapi.a.p((i18 >> 9) & 14, function2, rVar, false, true);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar2 = oVar;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p0(oVar2, function2, i10, i11, 2);
        }
    }

    public static final vu.z o0(Object obj) {
        if (obj != vu.d.f38360a) {
            Intrinsics.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (vu.z) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean p(g0 g0Var) {
        j2.h hVar;
        j2.v vVar;
        x xVar = g0Var.f20724c;
        if (xVar != null && (vVar = xVar.f20773b) != null) {
            hVar = new j2.h(vVar.f20770b);
        } else {
            hVar = null;
        }
        boolean z10 = false;
        if (hVar != null && hVar.f20725a == 1) {
            z10 = true;
        }
        return !z10;
    }

    public static File p0(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(tu.r1 r4, hu.c r5, java.lang.Throwable r6, yt.a r7) {
        /*
            boolean r0 = r7 instanceof tu.n
            if (r0 == 0) goto L13
            r0 = r7
            tu.n r0 = (tu.n) r0
            int r1 = r0.f36506c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36506c = r1
            goto L18
        L13:
            tu.n r0 = new tu.n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36505b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36506c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f36504a
            ut.n.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ut.n.b(r7)
            r0.f36504a = r6     // Catch: java.lang.Throwable -> L29
            r0.f36506c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.b(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            ut.c.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.f.q(tu.r1, hu.c, java.lang.Throwable, yt.a):java.lang.Object");
    }

    public static final void q0(CoroutineContext coroutineContext, Throwable th2) {
        Throwable runtimeException;
        Iterator it = vu.g.f38370a.iterator();
        while (it.hasNext()) {
            try {
                ((qu.d0) it.next()).X(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    ut.c.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            ut.c.a(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final void r(a x10, a b10) {
        if (sl.a.b(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x10, "x");
            Intrinsics.checkNotNullParameter(b10, "b");
            int[] iArr = x10.f18584a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            float[] fArr = x10.f18586c;
            float[] fArr2 = b10.f18586c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = (i15 * i12) + (i13 * i11 * i12) + i17;
                                    fArr[i19] = fArr[i19] + fArr2[i17];
                                    if (i18 >= i12) {
                                        break;
                                    } else {
                                        i17 = i18;
                                    }
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            } else {
                                i15 = i16;
                            }
                        }
                    }
                    if (i14 < i10) {
                        i13 = i14;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            sl.a.a(f.class, th2);
        }
    }

    public static boolean r0(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.f20842d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.f20842d == r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0709 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(j3.e r36, c3.d r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.f.s(j3.e, c3.d, java.util.ArrayList, int):void");
    }

    public static t0 s0(o1 o1Var, boolean z10, qu.r1 r1Var, int i10) {
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if (o1Var instanceof qu.x1) {
            return ((qu.x1) o1Var).W(z10, z11, r1Var);
        }
        return o1Var.j(z10, z11, new g2(r1Var, 4));
    }

    public static final int t(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final boolean t0(CoroutineContext coroutineContext) {
        o1 o1Var = (o1) coroutineContext.g(c0.f32192b);
        if (o1Var != null) {
            return o1Var.b();
        }
        return true;
    }

    public static final bv.d0 u(i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        return new bv.d0(i0Var);
    }

    public static final boolean u0(f0 f0Var) {
        o1 o1Var = (o1) f0Var.H().g(c0.f32192b);
        if (o1Var != null) {
            return o1Var.b();
        }
        return true;
    }

    public static final e0 v(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new e0(k0Var);
    }

    public static final boolean v0(AssertionError assertionError) {
        String message;
        Logger logger = bv.z.f7404a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !w.s(message, "getsockname failed", false)) {
            return false;
        }
        return true;
    }

    public static final LinkedHashMap w(ArrayList arrayList) {
        String str = b0.f7323b;
        b0 f10 = gt.d.f("/", false);
        LinkedHashMap h10 = vt.p0.h(new Pair(f10, new cv.g(f10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (cv.g gVar : vt.g0.M(arrayList, new c2.p(20))) {
            if (((cv.g) h10.put(gVar.f13094a, gVar)) == null) {
                while (true) {
                    b0 b0Var = gVar.f13094a;
                    b0 b10 = b0Var.b();
                    if (b10 != null) {
                        cv.g gVar2 = (cv.g) h10.get(b10);
                        if (gVar2 != null) {
                            gVar2.f13110q.add(b0Var);
                            break;
                        }
                        cv.g gVar3 = new cv.g(b10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        h10.put(b10, gVar3);
                        gVar3.f13110q.add(b0Var);
                        gVar = gVar3;
                    }
                }
            }
        }
        return h10;
    }

    public static final boolean w0(Object obj) {
        if (obj == vu.d.f38360a) {
            return true;
        }
        return false;
    }

    public static void x(Object obj, StringBuilder sb2) {
        int lastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static final boolean x0(long j10, long j11) {
        int j12 = w2.a.j(j10);
        int h10 = w2.a.h(j10);
        int i10 = (int) (j11 >> 32);
        if (j12 <= i10 && i10 <= h10) {
            int i11 = w2.a.i(j10);
            int g10 = w2.a.g(j10);
            int i12 = (int) (j11 & 4294967295L);
            if (i11 <= i12 && i12 <= g10) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle y(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f23353a;
            Object obj = pair.f23354b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                y3.c.a(bundle, str, (IBinder) obj);
            } else if (obj instanceof Size) {
                y3.d.a(bundle, str, (Size) obj);
            } else if (obj instanceof SizeF) {
                y3.d.b(bundle, str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static final boolean y0(String str) {
        if (str != null && str.length() != 0 && str.length() >= 43 && str.length() <= 128) {
            return new Regex("^[-._~A-Za-z0-9]+$").c(str);
        }
        return false;
    }

    public static final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator it = pu.j.a(new v1(view, null)).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = n0((View) it.next()).f20936a;
            for (int f10 = vt.y.f(arrayList); -1 < f10; f10--) {
                ((h3) arrayList.get(f10)).f13447a.c();
            }
        }
    }

    public static final float z0(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }
}
