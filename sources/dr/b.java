package dr;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import fr.i;
import gr.j;
import gr.k;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final yq.a f14469g = yq.a.d();

    /* renamed from: h, reason: collision with root package name */
    public static final long f14470h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f14475e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f14476f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f14471a = new ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f14472b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final String f14473c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d, reason: collision with root package name */
    public final long f14474d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j10, i iVar) {
        this.f14476f = j10;
        try {
            this.f14475e = this.f14472b.scheduleAtFixedRate(new a(this, iVar, 0), 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f14469g.f("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    public final k b(i iVar) {
        yq.a aVar;
        long parseLong;
        long parseLong2;
        j y10;
        double d10;
        long j10;
        long j11 = this.f14474d;
        yq.a aVar2 = f14469g;
        if (iVar == null) {
            return null;
        }
        try {
            try {
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f14473c));
                        try {
                            long a10 = iVar.a() + iVar.f16224a;
                            String[] split = bufferedReader.readLine().split(" ");
                            parseLong = Long.parseLong(split[13]);
                            parseLong2 = Long.parseLong(split[15]);
                            long parseLong3 = Long.parseLong(split[14]);
                            long parseLong4 = Long.parseLong(split[16]);
                            y10 = k.y();
                            y10.i();
                            k.v((k) y10.f11975b, a10);
                            d10 = (parseLong3 + parseLong4) / j11;
                            j10 = f14470h;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            long round = Math.round(d10 * j10);
                            y10.i();
                            k.x((k) y10.f11975b, round);
                            long round2 = Math.round(((parseLong + parseLong2) / j11) * j10);
                            y10.i();
                            k.w((k) y10.f11975b, round2);
                            k kVar = (k) y10.g();
                            bufferedReader.close();
                            return kVar;
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable th4 = th;
                            try {
                                bufferedReader.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        aVar = aVar2;
                        aVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
                        return null;
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        e = e11;
                        aVar2.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                        return null;
                    } catch (NullPointerException e12) {
                        e = e12;
                        aVar2.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                        return null;
                    } catch (NumberFormatException e13) {
                        e = e13;
                        aVar2.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
                        return null;
                    }
                } catch (IOException e14) {
                    e = e14;
                    aVar = aVar2;
                    aVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
                    return null;
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e15) {
                e = e15;
            }
        } catch (IOException e16) {
            e = e16;
            aVar = aVar2;
        }
    }
}
