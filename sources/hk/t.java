package hk;

import android.os.Build;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static final File f18562f = new File("/proc/self/fd");

    /* renamed from: g, reason: collision with root package name */
    public static volatile t f18563g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18566c;

    /* renamed from: d, reason: collision with root package name */
    public int f18567d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18568e = true;

    public t() {
        boolean z10 = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.getClass();
            char c10 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z10 = false;
                        break;
                    }
                    break;
            }
        }
        this.f18564a = z10;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18565b = 20000;
            this.f18566c = 0;
        } else {
            this.f18565b = 700;
            this.f18566c = 128;
        }
    }

    public static t a() {
        if (f18563g == null) {
            synchronized (t.class) {
                try {
                    if (f18563g == null) {
                        f18563g = new t();
                    }
                } finally {
                }
            }
        }
        return f18563g;
    }

    public final boolean b(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        if (!z10 || !this.f18564a || Build.VERSION.SDK_INT < 26 || z11 || i10 < (i12 = this.f18566c) || i11 < i12) {
            return false;
        }
        synchronized (this) {
            try {
                int i13 = this.f18567d + 1;
                this.f18567d = i13;
                if (i13 >= 50) {
                    this.f18567d = 0;
                    int length = f18562f.list().length;
                    if (length < this.f18565b) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.f18568e = z13;
                    if (!z13 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f18565b);
                    }
                }
                z12 = this.f18568e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}
