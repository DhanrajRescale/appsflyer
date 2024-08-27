package d2;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13545a;

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f13520b = new m0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f13521c = new m0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f13522d = new m0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f13523e = new m0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f13524f = new m0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f13525g = new m0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final m0 f13526h = new m0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f13527i = new m0(7);

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f13528j = new m0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final m0 f13529k = new m0(9);

    /* renamed from: l, reason: collision with root package name */
    public static final m0 f13530l = new m0(10);

    /* renamed from: m, reason: collision with root package name */
    public static final m0 f13531m = new m0(11);

    /* renamed from: n, reason: collision with root package name */
    public static final m0 f13532n = new m0(12);

    /* renamed from: o, reason: collision with root package name */
    public static final m0 f13533o = new m0(13);

    /* renamed from: p, reason: collision with root package name */
    public static final m0 f13534p = new m0(14);

    /* renamed from: q, reason: collision with root package name */
    public static final m0 f13535q = new m0(15);

    /* renamed from: r, reason: collision with root package name */
    public static final m0 f13536r = new m0(16);

    /* renamed from: s, reason: collision with root package name */
    public static final m0 f13537s = new m0(17);

    /* renamed from: t, reason: collision with root package name */
    public static final m0 f13538t = new m0(18);

    /* renamed from: u, reason: collision with root package name */
    public static final m0 f13539u = new m0(19);

    /* renamed from: v, reason: collision with root package name */
    public static final m0 f13540v = new m0(20);

    /* renamed from: w, reason: collision with root package name */
    public static final m0 f13541w = new m0(21);

    /* renamed from: x, reason: collision with root package name */
    public static final m0 f13542x = new m0(22);

    /* renamed from: y, reason: collision with root package name */
    public static final m0 f13543y = new m0(23);

    /* renamed from: z, reason: collision with root package name */
    public static final m0 f13544z = new m0(24);
    public static final m0 A = new m0(25);
    public static final m0 B = new m0(26);
    public static final m0 C = new m0(27);
    public static final m0 D = new m0(28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10) {
        super(0);
        this.f13545a = i10;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Choreographer choreographer;
        Float valueOf = Float.valueOf(s0.g.f34069a);
        switch (this.f13545a) {
            case 0:
                return Boolean.FALSE;
            case 1:
            case 2:
                return valueOf;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 6:
                AndroidCompositionLocals_androidKt.b("LocalLifecycleOwner");
                throw null;
            case 7:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 8:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 9:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 10:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    xu.e eVar = qu.r0.f32255a;
                    choreographer = (Choreographer) yk.g.X(vu.u.f38408a, new au.i(2, null));
                }
                h1 h1Var = new h1(choreographer, yk.j.N0(Looper.getMainLooper()));
                return h1Var.l(h1Var.f13438l);
            case 11:
            case 12:
                return null;
            case 13:
                s1.b("LocalAutofillTree");
                throw null;
            case 14:
                s1.b("LocalClipboardManager");
                throw null;
            case 15:
                s1.b("LocalDensity");
                throw null;
            case 16:
                s1.b("LocalFocusManager");
                throw null;
            case 17:
                s1.b("LocalFontFamilyResolver");
                throw null;
            case 18:
                s1.b("LocalFontLoader");
                throw null;
            case 19:
                s1.b("LocalHapticFeedback");
                throw null;
            case 20:
                s1.b("LocalInputManager");
                throw null;
            case 21:
                s1.b("LocalLayoutDirection");
                throw null;
            case 22:
            case 23:
            case 24:
                return null;
            case 25:
                s1.b("LocalTextToolbar");
                throw null;
            case 26:
                s1.b("LocalUriHandler");
                throw null;
            case 27:
                s1.b("LocalViewConfiguration");
                throw null;
            default:
                s1.b("LocalWindowInfo");
                throw null;
        }
    }
}
