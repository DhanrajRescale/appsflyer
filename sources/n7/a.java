package n7;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import jr.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f28329e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final File f28330a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f28331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28332c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f28333d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        File file2 = new File(file, h.r(str, ".lck"));
        this.f28330a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f28329e;
        synchronized (hashMap) {
            try {
                lock = (Lock) hashMap.get(absolutePath);
                if (lock == null) {
                    lock = new ReentrantLock();
                    hashMap.put(absolutePath, lock);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28331b = lock;
        this.f28332c = z10;
    }

    public final void a() {
        FileChannel fileChannel = this.f28333d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f28331b.unlock();
    }
}
