package u3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: i, reason: collision with root package name */
    public final Class f36721i;

    /* renamed from: j, reason: collision with root package name */
    public final Constructor f36722j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f36723k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f36724l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f36725m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f36726n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f36727o;

    public h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = D(cls);
            method3 = E(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = F(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f36721i = cls;
        this.f36722j = constructor;
        this.f36723k = method2;
        this.f36724l = method3;
        this.f36725m = method4;
        this.f36726n = method;
        this.f36727o = method5;
    }

    public static Method D(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method E(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final boolean A() {
        Method method = this.f36723k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object B() {
        try {
            return this.f36722j.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method F(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // u3.f, hr.c
    public final Typeface i(Context context, t3.f fVar, Resources resources, int i10) {
        if (!A()) {
            return super.i(context, fVar, resources, i10);
        }
        Object B = B();
        if (B == null) {
            return null;
        }
        for (t3.g gVar : fVar.f35302a) {
            if (!x(context, B, gVar.f35303a, gVar.f35307e, gVar.f35304b, gVar.f35305c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f35306d))) {
                w(B);
                return null;
            }
        }
        if (!z(B)) {
            return null;
        }
        return y(B);
    }

    @Override // u3.f, hr.c
    public final Typeface k(Context context, z3.h[] hVarArr, int i10) {
        Typeface y10;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!A()) {
            z3.h p10 = p(i10, hVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(p10.f41998a, MatchIndex.ROOT_VALUE, null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(p10.f42000c).setItalic(p10.f42001d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (z3.h hVar : hVarArr) {
            if (hVar.f42002e == 0) {
                Uri uri = hVar.f41998a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, hl.f.C0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object B = B();
        if (B == null) {
            return null;
        }
        int length = hVarArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            z3.h hVar2 = hVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f41998a);
            if (byteBuffer != null) {
                if (((Boolean) this.f36724l.invoke(B, byteBuffer, Integer.valueOf(hVar2.f41999b), null, Integer.valueOf(hVar2.f42000c), Integer.valueOf(hVar2.f42001d ? 1 : 0))).booleanValue()) {
                    z10 = true;
                } else {
                    w(B);
                    return null;
                }
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            w(B);
            return null;
        }
        if (!z(B) || (y10 = y(B)) == null) {
            return null;
        }
        return Typeface.create(y10, i10);
    }

    @Override // hr.c
    public final Typeface m(Context context, Resources resources, int i10, String str, int i11) {
        if (!A()) {
            return super.m(context, resources, i10, str, i11);
        }
        Object B = B();
        if (B == null) {
            return null;
        }
        if (!x(context, B, str, 0, -1, -1, null)) {
            w(B);
            return null;
        }
        if (!z(B)) {
            return null;
        }
        return y(B);
    }

    public final void w(Object obj) {
        try {
            this.f36726n.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean x(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f36723k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface y(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f36721i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f36727o.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean z(Object obj) {
        try {
            return ((Boolean) this.f36725m.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
