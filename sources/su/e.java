package su;

import com.google.android.gms.search.SearchAuth;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f34795a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f34796b = el.l.P0("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34797c = el.l.P0("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", SearchAuth.StatusCodes.AUTH_DISABLED, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final kp.g f34798d = new kp.g("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final kp.g f34799e = new kp.g("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final kp.g f34800f = new kp.g("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final kp.g f34801g = new kp.g("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final kp.g f34802h = new kp.g("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final kp.g f34803i = new kp.g("DONE_RCV", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final kp.g f34804j = new kp.g("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final kp.g f34805k = new kp.g("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final kp.g f34806l = new kp.g("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final kp.g f34807m = new kp.g("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final kp.g f34808n = new kp.g("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final kp.g f34809o = new kp.g("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final kp.g f34810p = new kp.g("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final kp.g f34811q = new kp.g("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final kp.g f34812r = new kp.g("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final kp.g f34813s = new kp.g("NO_CLOSE_CAUSE", 1);

    public static final boolean a(qu.h hVar, Object obj, Function1 function1) {
        kp.g e10 = hVar.e(obj, function1);
        if (e10 != null) {
            hVar.E(e10);
            return true;
        }
        return false;
    }
}
