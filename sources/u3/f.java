package u3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f extends hr.c {

    /* renamed from: d, reason: collision with root package name */
    public static Class f36712d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f36713e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f36714f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f36715g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f36716h = false;

    public f() {
        super(7);
    }

    public static boolean t(Object obj, String str, int i10, boolean z10) {
        u();
        try {
            return ((Boolean) f36714f.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void u() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f36716h) {
            return;
        }
        f36716h = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f36713e = constructor;
        f36712d = cls;
        f36714f = method2;
        f36715g = method;
    }

    @Override // hr.c
    public Typeface i(Context context, t3.f fVar, Resources resources, int i10) {
        u();
        try {
            Object newInstance = f36713e.newInstance(new Object[0]);
            for (t3.g gVar : fVar.f35302a) {
                File p02 = hl.f.p0(context);
                if (p02 == null) {
                    return null;
                }
                try {
                    if (!hl.f.N(p02, resources, gVar.f35308f)) {
                        return null;
                    }
                    if (!t(newInstance, p02.getPath(), gVar.f35304b, gVar.f35305c)) {
                        return null;
                    }
                    p02.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    p02.delete();
                }
            }
            u();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f36712d, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f36715g.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // hr.c
    public Typeface k(Context context, z3.h[] hVarArr, int i10) {
        File file;
        String readlink;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(p(i10, hVarArr).f41998a, MatchIndex.ROOT_VALUE, null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (Throwable th2) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface l10 = l(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return l10;
                }
                Typeface l102 = l(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return l102;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
