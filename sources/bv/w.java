package bv;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7400a;

    /* renamed from: b, reason: collision with root package name */
    public int f7401b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f7402c;

    /* renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f7403d;

    public w(RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f7402c = new ReentrantLock();
        this.f7403d = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void close() {
        ReentrantLock reentrantLock = this.f7402c;
        reentrantLock.lock();
        try {
            if (this.f7400a) {
                return;
            }
            this.f7400a = true;
            if (this.f7401b != 0) {
                return;
            }
            Unit unit = Unit.f23355a;
            synchronized (this) {
                this.f7403d.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f7402c;
        reentrantLock.lock();
        try {
            if (!this.f7400a) {
                Unit unit = Unit.f23355a;
                synchronized (this) {
                    length = this.f7403d.length();
                }
                return length;
            }
            throw new IllegalStateException("closed".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final o c(long j10) {
        ReentrantLock reentrantLock = this.f7402c;
        reentrantLock.lock();
        try {
            if (!this.f7400a) {
                this.f7401b++;
                reentrantLock.unlock();
                return new o(this, j10);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
