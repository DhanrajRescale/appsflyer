package j9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f21198a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f21199b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f21200c = {80, 75, 3, 4};

    public static d0 a(final String str, Callable callable) {
        i iVar;
        if (str == null) {
            iVar = null;
        } else {
            iVar = (i) p9.g.f30796b.f30797a.get(str);
        }
        final int i10 = 0;
        if (iVar != null) {
            return new d0(new m(iVar, 0), false);
        }
        HashMap hashMap = f21198a;
        if (str != null && hashMap.containsKey(str)) {
            return (d0) hashMap.get(str);
        }
        d0 d0Var = new d0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d0Var.b(new a0() { // from class: j9.n
                @Override // j9.a0
                public final void onResult(Object obj) {
                    int i11 = i10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i11) {
                        case 0:
                            HashMap hashMap2 = o.f21198a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                o.i();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = o.f21198a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                o.i();
                                return;
                            }
                            return;
                    }
                }
            });
            final int i11 = 1;
            d0Var.a(new a0() { // from class: j9.n
                @Override // j9.a0
                public final void onResult(Object obj) {
                    int i112 = i11;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i112) {
                        case 0:
                            HashMap hashMap2 = o.f21198a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                o.i();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = o.f21198a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                o.i();
                                return;
                            }
                            return;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, d0Var);
                if (hashMap.size() == 1) {
                    i();
                }
            }
        }
        return d0Var;
    }

    public static c0 b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return g(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new c0(e10);
        }
    }

    public static c0 c(InputStream inputStream, String str) {
        try {
            bv.e0 v10 = hl.f.v(hl.f.Z0(inputStream));
            String[] strArr = v9.c.f37801e;
            return d(new v9.d(v10), str, true);
        } finally {
            w9.f.b(inputStream);
        }
    }

    public static c0 d(v9.d dVar, String str, boolean z10) {
        try {
            try {
                i a10 = u9.t.a(dVar);
                if (str != null) {
                    p9.g.f30796b.f30797a.put(str, a10);
                }
                c0 c0Var = new c0(a10);
                if (z10) {
                    w9.f.b(dVar);
                }
                return c0Var;
            } catch (Exception e10) {
                c0 c0Var2 = new c0(e10);
                if (z10) {
                    w9.f.b(dVar);
                }
                return c0Var2;
            }
        } catch (Throwable th2) {
            if (z10) {
                w9.f.b(dVar);
            }
            throw th2;
        }
    }

    public static d0 e(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: j9.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return o.f(context2, i10, str);
            }
        });
    }

    public static c0 f(Context context, int i10, String str) {
        Boolean bool;
        try {
            bv.e0 v10 = hl.f.v(hl.f.Z0(context.getResources().openRawResource(i10)));
            try {
                bv.e0 peek = v10.peek();
                byte[] bArr = f21200c;
                int length = bArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (peek.readByte() != bArr[i11]) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        i11++;
                    } else {
                        peek.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                }
            } catch (Exception unused) {
                w9.b.f38875a.getClass();
                bool = Boolean.FALSE;
            } catch (NoSuchMethodError unused2) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return g(context, new ZipInputStream(v10.a0()), str);
            }
            return c(v10.a0(), str);
        } catch (Resources.NotFoundException e10) {
            return new c0(e10);
        }
    }

    public static c0 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            w9.f.b(zipInputStream);
        }
    }

    public static c0 h(Context context, ZipInputStream zipInputStream, String str) {
        z zVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            i iVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    bv.e0 v10 = hl.f.v(hl.f.Z0(zipInputStream));
                    String[] strArr = v9.c.f37801e;
                    iVar = (i) d(new v9.d(v10), null, false).f21133a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                                break;
                            }
                        } catch (Throwable th4) {
                            w9.b.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                        }
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            w9.b.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (iVar == null) {
                return new c0(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = iVar.f21169d.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zVar = (z) it.next();
                        if (zVar.f21252c.equals(str4)) {
                            break;
                        }
                    } else {
                        zVar = null;
                        break;
                    }
                }
                if (zVar != null) {
                    zVar.f21253d = w9.f.e((Bitmap) entry.getValue(), zVar.f21250a, zVar.f21251b);
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z10 = false;
                for (p9.c cVar : iVar.f21170e.values()) {
                    if (cVar.f30784a.equals(entry2.getKey())) {
                        cVar.f30787d = (Typeface) entry2.getValue();
                        z10 = true;
                    }
                }
                if (!z10) {
                    w9.b.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (hashMap.isEmpty()) {
                Iterator it2 = iVar.f21169d.entrySet().iterator();
                while (it2.hasNext()) {
                    z zVar2 = (z) ((Map.Entry) it2.next()).getValue();
                    if (zVar2 == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = zVar2.f21252c;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            zVar2.f21253d = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        } catch (IllegalArgumentException e10) {
                            w9.b.c("data URL did not have correct base64 format.", e10);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry entry3 : iVar.f21169d.entrySet()) {
                if (((z) entry3.getValue()).f21253d == null) {
                    return new c0(new IllegalStateException("There is no image for " + ((z) entry3.getValue()).f21252c));
                }
            }
            if (str != null) {
                p9.g.f30796b.f30797a.put(str, iVar);
            }
            return new c0(iVar);
        } catch (IOException e11) {
            return new c0(e11);
        }
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(f21199b);
        if (arrayList.size() <= 0) {
            return;
        }
        a3.a.u(arrayList.get(0));
        throw null;
    }

    public static String j(int i10, Context context) {
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }
}
