package vj;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n5.b0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f38122a;

    /* renamed from: b, reason: collision with root package name */
    public final File f38123b;

    /* renamed from: c, reason: collision with root package name */
    public final File f38124c;

    /* renamed from: d, reason: collision with root package name */
    public final File f38125d;

    /* renamed from: f, reason: collision with root package name */
    public final long f38127f;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f38130i;

    /* renamed from: k, reason: collision with root package name */
    public int f38132k;

    /* renamed from: h, reason: collision with root package name */
    public long f38129h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f38131j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f38133l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f38134m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());

    /* renamed from: n, reason: collision with root package name */
    public final a f38135n = new a(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final int f38126e = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f38128g = 1;

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public e(File file, long j10) {
        this.f38122a = file;
        this.f38123b = new File(file, "journal");
        this.f38124c = new File(file, "journal.tmp");
        this.f38125d = new File(file, "journal.bkp");
        this.f38127f = j10;
    }

    public static void H(File file, File file2, boolean z10) {
        if (z10) {
            c(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public static void a(e eVar, b0 b0Var, boolean z10) {
        synchronized (eVar) {
            c cVar = (c) b0Var.f28248c;
            if (cVar.f38114f == b0Var) {
                if (z10 && !cVar.f38113e) {
                    for (int i10 = 0; i10 < eVar.f38128g; i10++) {
                        if (((boolean[]) b0Var.f28249d)[i10]) {
                            if (!cVar.f38112d[i10].exists()) {
                                b0Var.a();
                                return;
                            }
                        } else {
                            b0Var.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < eVar.f38128g; i11++) {
                    File file = cVar.f38112d[i11];
                    if (z10) {
                        if (file.exists()) {
                            File file2 = cVar.f38111c[i11];
                            file.renameTo(file2);
                            long j10 = cVar.f38110b[i11];
                            long length = file2.length();
                            cVar.f38110b[i11] = length;
                            eVar.f38129h = (eVar.f38129h - j10) + length;
                        }
                    } else {
                        c(file);
                    }
                }
                eVar.f38132k++;
                cVar.f38114f = null;
                if (cVar.f38113e | z10) {
                    cVar.f38113e = true;
                    eVar.f38130i.append((CharSequence) "CLEAN");
                    eVar.f38130i.append(' ');
                    eVar.f38130i.append((CharSequence) cVar.f38109a);
                    eVar.f38130i.append((CharSequence) cVar.a());
                    eVar.f38130i.append('\n');
                    if (z10) {
                        long j11 = eVar.f38133l;
                        eVar.f38133l = 1 + j11;
                        cVar.f38115g = j11;
                    }
                } else {
                    eVar.f38131j.remove(cVar.f38109a);
                    eVar.f38130i.append((CharSequence) "REMOVE");
                    eVar.f38130i.append(' ');
                    eVar.f38130i.append((CharSequence) cVar.f38109a);
                    eVar.f38130i.append('\n');
                }
                f(eVar.f38130i);
                if (eVar.f38129h > eVar.f38127f || eVar.j()) {
                    eVar.f38134m.submit(eVar.f38135n);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static e l(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    H(file2, file3, false);
                }
            }
            e eVar = new e(file, j10);
            if (eVar.f38123b.exists()) {
                try {
                    eVar.v();
                    eVar.n();
                    return eVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    eVar.close();
                    h.a(eVar.f38122a);
                }
            }
            file.mkdirs();
            e eVar2 = new e(file, j10);
            eVar2.z();
            return eVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void I() {
        while (this.f38129h > this.f38127f) {
            String str = (String) ((Map.Entry) this.f38131j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f38130i != null) {
                        c cVar = (c) this.f38131j.get(str);
                        if (cVar != null && cVar.f38114f == null) {
                            for (int i10 = 0; i10 < this.f38128g; i10++) {
                                File file = cVar.f38111c[i10];
                                if (file.exists() && !file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                                long j10 = this.f38129h;
                                long[] jArr = cVar.f38110b;
                                this.f38129h = j10 - jArr[i10];
                                jArr[i10] = 0;
                            }
                            this.f38132k++;
                            this.f38130i.append((CharSequence) "REMOVE");
                            this.f38130i.append(' ');
                            this.f38130i.append((CharSequence) str);
                            this.f38130i.append('\n');
                            this.f38131j.remove(str);
                            if (j()) {
                                this.f38134m.submit(this.f38135n);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f38130i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f38131j.values()).iterator();
            while (it.hasNext()) {
                b0 b0Var = ((c) it.next()).f38114f;
                if (b0Var != null) {
                    b0Var.a();
                }
            }
            I();
            b(this.f38130i);
            this.f38130i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final b0 d(String str) {
        synchronized (this) {
            try {
                if (this.f38130i != null) {
                    c cVar = (c) this.f38131j.get(str);
                    if (cVar == null) {
                        cVar = new c(this, str);
                        this.f38131j.put(str, cVar);
                    } else if (cVar.f38114f != null) {
                        return null;
                    }
                    b0 b0Var = new b0(this, cVar, 0);
                    cVar.f38114f = b0Var;
                    this.f38130i.append((CharSequence) "DIRTY");
                    this.f38130i.append(' ');
                    this.f38130i.append((CharSequence) str);
                    this.f38130i.append('\n');
                    f(this.f38130i);
                    return b0Var;
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, vj.d] */
    public final synchronized d g(String str) {
        if (this.f38130i != null) {
            c cVar = (c) this.f38131j.get(str);
            if (cVar == null) {
                return null;
            }
            if (!cVar.f38113e) {
                return null;
            }
            for (File file : cVar.f38111c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f38132k++;
            this.f38130i.append((CharSequence) "READ");
            this.f38130i.append(' ');
            this.f38130i.append((CharSequence) str);
            this.f38130i.append('\n');
            if (j()) {
                this.f38134m.submit(this.f38135n);
            }
            long j10 = cVar.f38115g;
            File[] fileArr = cVar.f38111c;
            ?? r02 = cVar.f38110b;
            ?? obj = new Object();
            obj.f38118b = this;
            obj.f38119c = str;
            obj.f38117a = j10;
            obj.f38121e = fileArr;
            obj.f38120d = r02;
            return obj;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean j() {
        int i10 = this.f38132k;
        if (i10 >= 2000 && i10 >= this.f38131j.size()) {
            return true;
        }
        return false;
    }

    public final void n() {
        c(this.f38124c);
        Iterator it = this.f38131j.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            b0 b0Var = cVar.f38114f;
            int i10 = this.f38128g;
            int i11 = 0;
            if (b0Var == null) {
                while (i11 < i10) {
                    this.f38129h += cVar.f38110b[i11];
                    i11++;
                }
            } else {
                cVar.f38114f = null;
                while (i11 < i10) {
                    c(cVar.f38111c[i11]);
                    c(cVar.f38112d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void v() {
        File file = this.f38123b;
        g gVar = new g(new FileInputStream(file), h.f38142a);
        try {
            String a10 = gVar.a();
            String a11 = gVar.a();
            String a12 = gVar.a();
            String a13 = gVar.a();
            String a14 = gVar.a();
            if ("libcore.io.DiskLruCache".equals(a10) && "1".equals(a11) && Integer.toString(this.f38126e).equals(a12) && Integer.toString(this.f38128g).equals(a13) && HttpUrl.FRAGMENT_ENCODE_SET.equals(a14)) {
                int i10 = 0;
                while (true) {
                    try {
                        x(gVar.a());
                        i10++;
                    } catch (EOFException unused) {
                        this.f38132k = i10 - this.f38131j.size();
                        if (gVar.f38141e == -1) {
                            z();
                        } else {
                            this.f38130i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), h.f38142a));
                        }
                        try {
                            gVar.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
        } catch (Throwable th2) {
            try {
                gVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void x(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap linkedHashMap = this.f38131j;
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            c cVar = (c) linkedHashMap.get(substring);
            if (cVar == null) {
                cVar = new c(this, substring);
                linkedHashMap.put(substring, cVar);
            }
            int i11 = 0;
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.f38113e = true;
                cVar.f38114f = null;
                if (split.length == cVar.f38116h.f38128g) {
                    while (i11 < split.length) {
                        try {
                            cVar.f38110b[i11] = Long.parseLong(split[i11]);
                            i11++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f38114f = new b0(this, cVar, i11);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void z() {
        try {
            BufferedWriter bufferedWriter = this.f38130i;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f38124c), h.f38142a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f38126e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f38128g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (c cVar : this.f38131j.values()) {
                    if (cVar.f38114f != null) {
                        bufferedWriter2.write("DIRTY " + cVar.f38109a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + cVar.f38109a + cVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f38123b.exists()) {
                    H(this.f38123b, this.f38125d, true);
                }
                H(this.f38124c, this.f38123b, false);
                this.f38125d.delete();
                this.f38130i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f38123b, true), h.f38142a));
            } catch (Throwable th2) {
                b(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
