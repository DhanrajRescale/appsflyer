package e4;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d4.y2;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f14972e = new f(1, (String) null);

    /* renamed from: f, reason: collision with root package name */
    public static final f f14973f = new f(2, (String) null);

    /* renamed from: g, reason: collision with root package name */
    public static final f f14974g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f14975h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f14976i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f14977j;

    /* renamed from: k, reason: collision with root package name */
    public static final f f14978k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f14979l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f14980m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f14981n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f14982o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f14983p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f14984q;

    /* renamed from: r, reason: collision with root package name */
    public static final f f14985r;

    /* renamed from: s, reason: collision with root package name */
    public static final f f14986s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f14987t;

    /* renamed from: u, reason: collision with root package name */
    public static final f f14988u;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14989a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14990b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f14991c;

    /* renamed from: d, reason: collision with root package name */
    public final y f14992d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = null;
        new f(4, (String) null);
        new f(8, (String) null);
        f14974g = new f(16, (String) null);
        new f(32, (String) null);
        f14975h = new f(64, (String) null);
        f14976i = new f(128, (String) null);
        new f(256, r.class);
        new f(512, r.class);
        new f(UserMetadata.MAX_ATTRIBUTE_SIZE, s.class);
        new f(2048, s.class);
        f14977j = new f(4096, (String) null);
        f14978k = new f(UserMetadata.MAX_INTERNAL_KEY_SIZE, (String) null);
        new f(Http2.INITIAL_MAX_FRAME_SIZE, (String) null);
        new f(32768, (String) null);
        new f(65536, (String) null);
        new f(131072, w.class);
        f14979l = new f(262144, (String) null);
        f14980m = new f(524288, (String) null);
        f14981n = new f(1048576, (String) null);
        new f(2097152, x.class);
        int i10 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        f14982o = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, u.class);
        f14983p = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f14984q = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f14985r = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f14986s = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (i10 >= 29) {
            accessibilityAction = y2.g();
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i10 >= 29) {
            accessibilityAction2 = y2.A();
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = y2.C();
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i10 >= 29) {
            accessibilityAction4 = y2.D();
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f14987t = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, v.class);
        if (i10 >= 26) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            accessibilityAction5 = accessibilityAction20;
        } else {
            accessibilityAction5 = null;
        }
        new f(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, t.class);
        if (i10 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction6 = accessibilityAction19;
        } else {
            accessibilityAction6 = null;
        }
        new f(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i10 >= 28) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction7 = accessibilityAction18;
        } else {
            accessibilityAction7 = null;
        }
        new f(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i10 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            accessibilityAction8 = accessibilityAction17;
        } else {
            accessibilityAction8 = null;
        }
        new f(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i10 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction9 = accessibilityAction16;
        } else {
            accessibilityAction9 = null;
        }
        new f(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
        if (i10 >= 32) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            accessibilityAction10 = accessibilityAction15;
        } else {
            accessibilityAction10 = null;
        }
        new f(accessibilityAction10, R.id.ALT, null, null, null);
        if (i10 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        new f(accessibilityAction11, R.id.CTRL, null, null, null);
        if (i10 >= 32) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction12 = accessibilityAction14;
        } else {
            accessibilityAction12 = null;
        }
        new f(accessibilityAction12, R.id.FUNCTION, null, null, null);
        if (i10 >= 33) {
            accessibilityAction13 = androidx.activity.n.k();
        } else {
            accessibilityAction13 = null;
        }
        new f(accessibilityAction13, R.id.KEYCODE_0, null, null, null);
        if (i10 >= 34) {
            accessibilityAction21 = j.a();
        }
        f14988u = new f(accessibilityAction21, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public f(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f14989a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f14989a;
        Object obj3 = this.f14989a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f14989a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d10 = m.d(this.f14990b);
        if (d10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f14989a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d10);
        return sb2.toString();
    }

    public f(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public f(Object obj, int i10, String str, y yVar, Class cls) {
        this.f14990b = i10;
        this.f14992d = yVar;
        if (obj == null) {
            this.f14989a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
        } else {
            this.f14989a = obj;
        }
        this.f14991c = cls;
    }
}
