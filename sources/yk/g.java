package yk;

import android.app.Activity;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.j0;
import androidx.navigation.k0;
import androidx.navigation.l0;
import androidx.work.g0;
import b5.i0;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookSdk;
import g7.u4;
import g7.v4;
import g7.w4;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import iu.z;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k7.t0;
import k7.u1;
import kh.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lu.d;
import m0.p1;
import nl.n0;
import o8.a0;
import o8.x;
import org.json.JSONObject;
import qu.a2;
import qu.b1;
import qu.f0;
import qu.h2;
import qu.i1;
import qu.k2;
import qu.m0;
import qu.o0;
import qu.q2;
import qu.r0;
import qu.r2;
import qu.y1;
import qu.z1;
import t0.m3;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static float f41690a;

    public static final qu.i A(yt.a aVar) {
        qu.i iVar;
        qu.i iVar2;
        if (!(aVar instanceof vu.h)) {
            return new qu.i(1, aVar);
        }
        vu.h hVar = (vu.h) aVar;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vu.h.f38373h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            iVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vu.i.f38382b);
                iVar2 = null;
                break;
            }
            if (obj instanceof qu.i) {
                kp.g gVar = vu.i.f38382b;
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, gVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                iVar2 = (qu.i) obj;
                break loop0;
            }
            if (obj != vu.i.f38382b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (iVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qu.i.f32213g;
            Object obj2 = atomicReferenceFieldUpdater2.get(iVar2);
            if ((obj2 instanceof qu.s) && ((qu.s) obj2).f32262d != null) {
                iVar2.l();
            } else {
                qu.i.f32212f.set(iVar2, 536870911);
                atomicReferenceFieldUpdater2.set(iVar2, qu.b.f32182a);
                iVar = iVar2;
            }
            if (iVar != null) {
                return iVar;
            }
        }
        return new qu.i(2, aVar);
    }

    public static final int B(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
            return i11;
        }
        if (i12 < 0) {
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i11 + i19;
            }
            return i11;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static int C(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(jr.h.o("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static androidx.work.v D(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                                return androidx.work.v.f2643f;
                            }
                            throw new IllegalArgumentException(jr.h.o("Could not convert ", i10, " to NetworkType"));
                        }
                        return androidx.work.v.f2642e;
                    }
                    return androidx.work.v.f2641d;
                }
                return androidx.work.v.f2640c;
            }
            return androidx.work.v.f2639b;
        }
        return androidx.work.v.f2638a;
    }

    public static int E(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(jr.h.o("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static g0 F(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return g0.f2570f;
                            }
                            throw new IllegalArgumentException(jr.h.o("Could not convert ", i10, " to State"));
                        }
                        return g0.f2569e;
                    }
                    return g0.f2568d;
                }
                return g0.f2567c;
            }
            return g0.f2566b;
        }
        return g0.f2565a;
    }

    public static final void G(qu.h hVar, qu.f fVar) {
        if (hVar instanceof qu.i) {
            ((qu.i) hVar).v(fVar);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [qu.a, qu.h2] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static h2 H(f0 f0Var, CoroutineContext.Element element, qu.g0 g0Var, Function2 function2, int i10) {
        ?? r22;
        CoroutineContext coroutineContext = element;
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.k.f23369a;
        }
        if ((i10 & 2) != 0) {
            g0Var = qu.g0.f32205a;
        }
        CoroutineContext J = J(f0Var, coroutineContext);
        g0Var.getClass();
        if (g0Var == qu.g0.f32206b) {
            r22 = new a2(J, function2);
        } else {
            r22 = new qu.a(J, true);
        }
        r22.m0(g0Var, r22, function2);
        return r22;
    }

    public static final k0 I(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        l0 l0Var = new l0();
        optionsBuilder.invoke(l0Var);
        boolean z10 = l0Var.f2248b;
        j0 j0Var = l0Var.f2247a;
        j0Var.f2220a = z10;
        j0Var.f2221b = l0Var.f2249c;
        int i10 = l0Var.f2250d;
        boolean z11 = l0Var.f2251e;
        boolean z12 = l0Var.f2252f;
        j0Var.f2222c = i10;
        j0Var.f2223d = null;
        j0Var.f2224e = z11;
        j0Var.f2225f = z12;
        return j0Var.a();
    }

    public static final CoroutineContext J(f0 f0Var, CoroutineContext coroutineContext) {
        CoroutineContext u10 = u(f0Var.H(), coroutineContext, true);
        xu.e eVar = r0.f32255a;
        if (u10 != eVar && u10.g(kotlin.coroutines.f.O) == null) {
            return u10.l(eVar);
        }
        return u10;
    }

    public static y K(String userId, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        y yVar = new y();
        yVar.setArguments(hl.f.y(new Pair("USER_IDENTIFIER", userId), new Pair("USER_NAME", str), new Pair("IS_FRIEND", Boolean.valueOf(z10))));
        return yVar;
    }

    public static final int L(d.Companion companion, IntRange range) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            int i10 = range.f23381a;
            int i11 = range.f23382b;
            if (i11 < Integer.MAX_VALUE) {
                companion.getClass();
                return lu.d.f25398b.d(i10, i11 + 1);
            }
            if (i10 > Integer.MIN_VALUE) {
                companion.getClass();
                return lu.d.f25398b.d(i10 - 1, i11) + 1;
            }
            companion.getClass();
            return lu.d.f25398b.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static void M(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new IllegalStateException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th2, th2);
        }
        th2.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    public static String N(String str, JSONObject jSONObject) {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static void O(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                M(new IllegalStateException(nn.d.j("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
    }

    public static Cursor P(l7.s sVar, l7.t tVar, boolean z10) {
        int i10;
        Cursor g10 = sVar.g(tVar);
        if (z10 && (g10 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) g10;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i10 = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i10 = count;
            }
            if (i10 < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i11 = 0; i11 < abstractWindowedCursor.getColumnCount(); i11++) {
                            int type = abstractWindowedCursor.getType(i11);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i11] = abstractWindowedCursor.getBlob(i11);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i11] = abstractWindowedCursor.getString(i11);
                                        }
                                    } else {
                                        objArr[i11] = Double.valueOf(abstractWindowedCursor.getDouble(i11));
                                    }
                                } else {
                                    objArr[i11] = Long.valueOf(abstractWindowedCursor.getLong(i11));
                                }
                            } else {
                                objArr[i11] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th2) {
                    abstractWindowedCursor.close();
                    throw th2;
                }
            }
        }
        return g10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:13:0x0025, B:15:0x0028, B:18:0x009f, B:24:0x0036, B:44:0x0074, B:46:0x0077, B:47:0x0089, B:50:0x0082, B:37:0x005e, B:39:0x0061, B:34:0x0070, B:28:0x008a, B:30:0x008d), top: B:3:0x0003, inners: #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized yk.t Q() {
        /*
            java.lang.Class<yk.g> r0 = yk.g.class
            monitor-enter(r0)
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            yk.f r4 = new yk.f     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            r5.<init>(r3)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L51 java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L44
            yk.t r3 = (yk.t) r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            nl.n0.e(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            goto L3d
        L32:
            r1 = move-exception
            goto La6
        L35:
            r1 = move-exception
            java.lang.String r2 = "yk.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L32
        L3d:
            r2 = r3
            goto L9d
        L40:
            r2 = move-exception
            goto L74
        L42:
            r3 = move-exception
            goto L57
        L44:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42 java.io.FileNotFoundException -> L8a
        L4c:
            r4 = r2
            r2 = r3
            goto L74
        L4f:
            r4 = r2
            goto L57
        L51:
            r4 = r2
            goto L8a
        L53:
            r3 = move-exception
            goto L4c
        L55:
            r3 = move-exception
            goto L4f
        L57:
            java.lang.String r5 = "yk.g"
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L40
            nl.n0.e(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L6b
            goto L9d
        L6b:
            r1 = move-exception
            java.lang.String r3 = "yk.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L74:
            nl.n0.e(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L81
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L81
            goto L89
        L81:
            r1 = move-exception
            java.lang.String r3 = "yk.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L32
        L89:
            throw r2     // Catch: java.lang.Throwable -> L32
        L8a:
            nl.n0.e(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L97
            r1.delete()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L97
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = "yk.g"
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        L9d:
            if (r2 != 0) goto La4
            yk.t r2 = new yk.t     // Catch: java.lang.Throwable -> L32
            r2.<init>()     // Catch: java.lang.Throwable -> L32
        La4:
            monitor-exit(r0)
            return r2
        La6:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.g.Q():yk.t");
    }

    public static long R(int i10, int i11, e5.p pVar) {
        pVar.F(i10);
        if (pVar.a() < 5) {
            return -9223372036854775807L;
        }
        int g10 = pVar.g();
        if ((8388608 & g10) != 0 || ((2096896 & g10) >> 8) != i11 || (g10 & 32) == 0 || pVar.u() < 7 || pVar.a() < 7 || (pVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        pVar.e(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }

    public static int S(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                channel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th2;
        }
    }

    public static final o8.n T(Object obj, q1.b bVar, q1.b bVar2, t0.n nVar, int i10) {
        Function1 yVar;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1445305568);
        androidx.work.u uVar = a2.k.f97b;
        p1.h.S.getClass();
        int i11 = p1.g.f30508c;
        o8.w wVar = o8.p.f29829b;
        n8.i x10 = x(x.f29855a, rVar);
        rVar.b0(-79978785);
        o8.q qVar = new o8.q(obj, wVar, x10);
        z8.e eVar = a0.f29785b;
        int i12 = 0;
        if (bVar == null && bVar2 == null && bVar2 == null) {
            yVar = o8.n.f29812t;
        } else {
            yVar = new o8.y(i12, bVar, bVar2, bVar2);
        }
        o8.n b10 = o8.p.b(qVar, yVar, null, uVar, i11, rVar);
        rVar.s(false);
        rVar.s(false);
        return b10;
    }

    public static void U(d5.a aVar) {
        aVar.f13887k = -3.4028235E38f;
        aVar.f13886j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f13877a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f13877a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f13877a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static y6.g V(y6.g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (y6.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                y6.g gVar2 = new y6.g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((y6.g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((y6.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((y6.g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static float W(float f10, int i10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public static final Object X(CoroutineContext coroutineContext, Function2 function2) {
        b1 b1Var;
        CoroutineContext u10;
        long j10;
        qu.t tVar;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.i iVar = kotlin.coroutines.f.O;
        kotlin.coroutines.f fVar = (kotlin.coroutines.f) coroutineContext.g(iVar);
        if (fVar == null) {
            b1Var = k2.a();
            u10 = u(kotlin.coroutines.k.f23369a, coroutineContext.l(b1Var), true);
            xu.e eVar = r0.f32255a;
            if (u10 != eVar && u10.g(iVar) == null) {
                u10 = u10.l(eVar);
            }
        } else {
            if (fVar instanceof b1) {
            }
            b1Var = (b1) k2.f32232a.get();
            u10 = u(kotlin.coroutines.k.f23369a, coroutineContext, true);
            xu.e eVar2 = r0.f32255a;
            if (u10 != eVar2 && u10.g(iVar) == null) {
                u10 = u10.l(eVar2);
            }
        }
        qu.d dVar = new qu.d(u10, currentThread, b1Var);
        dVar.m0(qu.g0.f32205a, dVar, function2);
        b1 b1Var2 = dVar.f32196e;
        if (b1Var2 != null) {
            int i10 = b1.f32184f;
            b1Var2.i0(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (b1Var2 != null) {
                    j10 = b1Var2.k0();
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (!(!(dVar.P() instanceof i1))) {
                    LockSupport.parkNanos(dVar, j10);
                } else {
                    if (b1Var2 != null) {
                        int i11 = b1.f32184f;
                        b1Var2.f0(false);
                    }
                    Object a10 = y1.a(dVar.P());
                    if (a10 instanceof qu.t) {
                        tVar = (qu.t) a10;
                    } else {
                        tVar = null;
                    }
                    if (tVar == null) {
                        return a10;
                    }
                    throw tVar.f32267a;
                }
            } catch (Throwable th2) {
                if (b1Var2 != null) {
                    int i12 = b1.f32184f;
                    b1Var2.f0(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        dVar.w(interruptedException);
        throw interruptedException;
    }

    public static final void Y(t tVar) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(tVar);
                n0.e(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w("yk.g", "Got unexpected exception while persisting events: ", th);
                    try {
                        applicationContext.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    n0.e(objectOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void Z(View view, o7.f fVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, x8.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, x8.g] */
    public static final x8.g a(Context context, x8.f fVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) r3.k.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null && r3.k.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new x8.h(connectivityManager, fVar);
            } catch (Exception unused) {
                return new Object();
            }
        }
        return new Object();
    }

    public static final boolean a0(w4 w4Var, w4 w4Var2, g7.b1 loadType) {
        Intrinsics.checkNotNullParameter(w4Var, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        if (w4Var2 == null) {
            return true;
        }
        if ((w4Var2 instanceof v4) && (w4Var instanceof u4)) {
            return true;
        }
        if ((!(w4Var instanceof v4) || !(w4Var2 instanceof u4)) && (w4Var.f17114c != w4Var2.f17114c || w4Var.f17115d != w4Var2.f17115d || w4Var2.a(loadType) > w4Var.a(loadType))) {
            return true;
        }
        return false;
    }

    public static void b(AtomicLong atomicLong) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            j11 = Long.MAX_VALUE;
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            long j12 = j10 + Long.MAX_VALUE;
            if (j12 >= 0) {
                j11 = j12;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
    }

    public static int b0(g0 g0Var) {
        int ordinal = g0Var.ordinal();
        if (ordinal != 0) {
            int i10 = 1;
            if (ordinal != 1) {
                i10 = 2;
                if (ordinal != 2) {
                    i10 = 3;
                    if (ordinal != 3) {
                        i10 = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + g0Var + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    public static int c(r4.b bVar, boolean z10) {
        int i10;
        int i11;
        byte b10;
        if (z10) {
            i10 = bVar.f33057c;
        } else {
            i10 = bVar.f33056b;
        }
        if (z10) {
            i11 = bVar.f33056b;
        } else {
            i11 = bVar.f33057c;
        }
        byte[][] bArr = (byte[][]) bVar.f33058d;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            byte b11 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                if (z10) {
                    b10 = bArr[i13][i15];
                } else {
                    b10 = bArr[i15][i13];
                }
                if (b10 == b11) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    i14 = 1;
                    b11 = b10;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    public static final double c0(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [qu.a, qu.m0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static m0 d(f0 f0Var, ru.d dVar, Function2 function2, int i10) {
        qu.g0 g0Var;
        ?? r22;
        CoroutineContext coroutineContext = dVar;
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.k.f23369a;
        }
        if ((i10 & 2) != 0) {
            g0Var = qu.g0.f32205a;
        } else {
            g0Var = null;
        }
        CoroutineContext J = J(f0Var, coroutineContext);
        g0Var.getClass();
        if (g0Var == qu.g0.f32206b) {
            r22 = new z1(J, function2);
        } else {
            r22 = new qu.a(J, true);
        }
        r22.m0(g0Var, r22, function2);
        return r22;
    }

    public static final q2 d0(yt.a aVar, CoroutineContext coroutineContext, Object obj) {
        q2 q2Var = null;
        if (!(aVar instanceof au.d)) {
            return null;
        }
        if (coroutineContext.g(r2.f32258a) != null) {
            au.d dVar = (au.d) aVar;
            while (true) {
                if ((dVar instanceof o0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof q2) {
                    q2Var = (q2) dVar;
                    break;
                }
            }
            if (q2Var != null) {
                q2Var.o0(coroutineContext, obj);
            }
        }
        return q2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.g e(byte[] r7) {
        /*
            androidx.work.g r0 = new androidx.work.g
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            androidx.work.f r5 = new androidx.work.f     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f2564a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.g.e(byte[]):androidx.work.g");
    }

    public static final Object e0(CoroutineContext coroutineContext, Function2 function2, yt.a frame) {
        CoroutineContext u10;
        Object a10;
        CoroutineContext context = frame.getContext();
        if (!((Boolean) coroutineContext.R(Boolean.FALSE, qu.y.f32298a)).booleanValue()) {
            u10 = context.l(coroutineContext);
        } else {
            u10 = u(context, coroutineContext, false);
        }
        hl.f.W(u10);
        if (u10 == context) {
            vu.y yVar = new vu.y(frame, u10);
            a10 = hl.f.b1(yVar, yVar, function2);
        } else {
            yt.b bVar = kotlin.coroutines.f.O;
            if (Intrinsics.a(u10.g(bVar), context.g(bVar))) {
                q2 q2Var = new q2(frame, u10);
                CoroutineContext coroutineContext2 = q2Var.f32177c;
                Object c10 = vu.f0.c(coroutineContext2, null);
                try {
                    Object b12 = hl.f.b1(q2Var, q2Var, function2);
                    vu.f0.a(coroutineContext2, c10);
                    a10 = b12;
                } catch (Throwable th2) {
                    vu.f0.a(coroutineContext2, c10);
                    throw th2;
                }
            } else {
                vu.y yVar2 = new vu.y(frame, u10);
                wu.a.a(function2, yVar2, yVar2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o0.f32246e;
                    int i10 = atomicIntegerFieldUpdater.get(yVar2);
                    if (i10 != 0) {
                        if (i10 == 2) {
                            a10 = y1.a(yVar2.P());
                            if (a10 instanceof qu.t) {
                                throw ((qu.t) a10).f32267a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(yVar2, 0, 1)) {
                        a10 = zt.a.f42823a;
                        break;
                    }
                }
            }
        }
        if (a10 == zt.a.f42823a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a10;
    }

    public static at.l f(bt.a aVar) {
        try {
            Object call = aVar.call();
            gt.e.a(call, "Scheduler Callable result can't be null");
            return (at.l) call;
        } catch (Throwable th2) {
            throw rt.b.b(th2);
        }
    }

    public static void g(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void h(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void i(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void j(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final void k(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                ut.c.a(th2, th3);
            }
        }
    }

    public static int l(u1 u1Var, t0 t0Var, View view, View view2, k7.i1 i1Var, boolean z10) {
        if (i1Var.v() != 0 && u1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(k7.i1.H(view) - k7.i1.H(view2)) + 1;
            }
            return Math.min(t0Var.g(), t0Var.b(view2) - t0Var.d(view));
        }
        return 0;
    }

    public static int m(u1 u1Var, t0 t0Var, View view, View view2, k7.i1 i1Var, boolean z10, boolean z11) {
        int max;
        if (i1Var.v() == 0 || u1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(k7.i1.H(view), k7.i1.H(view2));
        int max2 = Math.max(k7.i1.H(view), k7.i1.H(view2));
        if (z11) {
            max = Math.max(0, (u1Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(t0Var.b(view2) - t0Var.d(view)) / (Math.abs(k7.i1.H(view) - k7.i1.H(view2)) + 1))) + (t0Var.f() - t0Var.d(view)));
    }

    public static int n(u1 u1Var, t0 t0Var, View view, View view2, k7.i1 i1Var, boolean z10) {
        if (i1Var.v() != 0 && u1Var.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return u1Var.b();
            }
            return (int) (((t0Var.b(view2) - t0Var.d(view)) / (Math.abs(k7.i1.H(view) - k7.i1.H(view2)) + 1)) * u1Var.b());
        }
        return 0;
    }

    public static final double o(int i10, int i11, int i12, int i13, z8.f fVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int ordinal = fVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Math.min(d10, d11);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d10, d11);
    }

    public static bq.a p(String str, String str2) {
        hr.a aVar = new hr.a(str, str2);
        i0 a10 = bq.a.a(hr.a.class);
        a10.f3352c = 1;
        a10.f3355f = new b3.t(aVar, 0);
        return a10.c();
    }

    public static boolean q(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (q(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    public static int r(float f10, Context context) {
        if (f41690a == s0.g.f34069a) {
            f41690a = context.getResources().getDisplayMetrics().density;
        }
        return (int) (f10 * f41690a);
    }

    public static p1 s(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(380403812);
        float f10 = 6;
        float f11 = 12;
        float f12 = 8;
        float f13 = 8;
        rVar.b0(795787840);
        boolean e10 = rVar.e(f10) | rVar.e(f11) | rVar.e(f12) | rVar.e(f13);
        Object Q = rVar.Q();
        if (e10 || Q == t0.m.f35080a) {
            Q = new p1(f10, f11, f12, f13);
            rVar.k0(Q);
        }
        p1 p1Var = (p1) Q;
        rVar.s(false);
        rVar.s(false);
        return p1Var;
    }

    public static final androidx.navigation.t t(Activity activity, int i10) {
        View findViewById;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i11 = q3.h.f31615a;
        if (Build.VERSION.SDK_INT >= 28) {
            findViewById = (View) q3.d.a(activity, i10);
        } else {
            findViewById = activity.findViewById(i10);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "requireViewById<View>(activity, viewId)");
        androidx.navigation.t tVar = (androidx.navigation.t) pu.p.f(pu.p.h(pu.m.d(androidx.navigation.c.f2169k, findViewById), androidx.navigation.c.f2170l));
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [iu.k, kotlin.jvm.functions.Function2] */
    public static final CoroutineContext u(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        qu.y yVar = qu.y.f32298a;
        boolean booleanValue = ((Boolean) coroutineContext.R(bool, yVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.R(bool, yVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.l(coroutineContext2);
        }
        z zVar = new z();
        zVar.f20560a = coroutineContext2;
        kotlin.coroutines.k kVar = kotlin.coroutines.k.f23369a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.R(kVar, new iu.k(2));
        if (booleanValue2) {
            zVar.f20560a = ((CoroutineContext) zVar.f20560a).R(kVar, qu.w.f32287a);
        }
        return coroutineContext3.l((CoroutineContext) zVar.f20560a);
    }

    public static bq.a v(String str, i5.w wVar) {
        i0 a10 = bq.a.a(hr.a.class);
        a10.f3352c = 1;
        a10.b(bq.j.c(Context.class));
        a10.f3355f = new hr.d(str, 0, wVar);
        return a10.c();
    }

    public static final o7.f w(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (o7.f) pu.p.f(pu.p.h(pu.m.d(o7.g.f29768b, view), o7.g.f29769c));
    }

    public static final n8.i x(m3 m3Var, t0.n nVar) {
        n8.i iVar;
        n8.j jVar;
        n8.o a10;
        t0.r rVar = (t0.r) nVar;
        n8.i iVar2 = (n8.i) rVar.m(m3Var);
        if (iVar2 == null) {
            Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
            n8.i iVar3 = n8.a.f28358b;
            if (iVar3 == null) {
                synchronized (n8.a.f28357a) {
                    try {
                        iVar = n8.a.f28358b;
                        if (iVar == null) {
                            Object applicationContext = context.getApplicationContext();
                            if (applicationContext instanceof n8.j) {
                                jVar = (n8.j) applicationContext;
                            } else {
                                jVar = null;
                            }
                            if (jVar != null) {
                                StockGroApplication stockGroApplication = (StockGroApplication) jVar;
                                n8.h hVar = new n8.h(stockGroApplication);
                                hVar.f28375c = ut.h.a(new z9.d(stockGroApplication, 0));
                                hVar.f28376d = ut.h.a(new z9.d(stockGroApplication, 1));
                                d9.i iVar4 = hVar.f28377e;
                                hVar.f28377e = new d9.i(iVar4.f14231a, iVar4.f14232b, false, iVar4.f14234d, iVar4.f14235e);
                                a10 = hVar.a();
                            } else {
                                a10 = new n8.h(context).a();
                            }
                            iVar = a10;
                            n8.a.f28358b = iVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return iVar;
            }
            return iVar3;
        }
        return iVar2;
    }

    public static final Class y(ou.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Class f20549a = ((iu.d) bVar).getF20549a();
        Intrinsics.d(f20549a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return f20549a;
    }

    public static final Class z(ou.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Class f20549a = ((iu.d) bVar).getF20549a();
        if (!f20549a.isPrimitive()) {
            return f20549a;
        }
        String name = f20549a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return f20549a;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return f20549a;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return f20549a;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return f20549a;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return f20549a;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return f20549a;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return f20549a;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return f20549a;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return f20549a;
            default:
                return f20549a;
        }
    }
}
