package i0;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.text.BreakIterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final r f19162b = new r(1);

    /* renamed from: c, reason: collision with root package name */
    public static final r f19163c = new r(2);

    /* renamed from: d, reason: collision with root package name */
    public static final r f19164d = new r(3);

    /* renamed from: e, reason: collision with root package name */
    public static final r f19165e = new r(4);

    /* renamed from: f, reason: collision with root package name */
    public static final r f19166f = new r(6);

    /* renamed from: g, reason: collision with root package name */
    public static final r f19167g = new r(7);

    /* renamed from: h, reason: collision with root package name */
    public static final r f19168h = new r(8);

    /* renamed from: i, reason: collision with root package name */
    public static final r f19169i = new r(9);

    /* renamed from: j, reason: collision with root package name */
    public static final r f19170j = new r(10);

    /* renamed from: k, reason: collision with root package name */
    public static final r f19171k = new r(11);

    /* renamed from: l, reason: collision with root package name */
    public static final r f19172l = new r(12);

    /* renamed from: m, reason: collision with root package name */
    public static final r f19173m = new r(13);

    /* renamed from: n, reason: collision with root package name */
    public static final r f19174n = new r(14);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10) {
        super(1);
        this.f19175a = i10;
    }

    public final p2.g a(l0.r0 r0Var) {
        switch (this.f19175a) {
            case 8:
                long j10 = r0Var.f23768f;
                int i10 = j2.f0.f20711c;
                String str = r0Var.f23769g.f20699a;
                Object obj = q4.a.f31656a;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                return new p2.g(((int) (j10 & 4294967295L)) - characterInstance.preceding((int) (4294967295L & j10)), 0);
            case 9:
                String str2 = r0Var.f23769g.f20699a;
                long j11 = r0Var.f23768f;
                int i11 = j2.f0.f20711c;
                Object obj2 = q4.a.f31656a;
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(str2);
                int following = characterInstance2.following((int) (j11 & 4294967295L));
                if (following == -1) {
                    return null;
                }
                return new p2.g(0, following - ((int) (4294967295L & r0Var.f23768f)));
            case 10:
                Integer d10 = r0Var.d();
                if (d10 == null) {
                    return null;
                }
                int intValue = d10.intValue();
                long j12 = r0Var.f23768f;
                int i12 = j2.f0.f20711c;
                return new p2.g(((int) (4294967295L & j12)) - intValue, 0);
            case 11:
                Integer c10 = r0Var.c();
                if (c10 == null) {
                    return null;
                }
                int intValue2 = c10.intValue();
                long j13 = r0Var.f23768f;
                int i13 = j2.f0.f20711c;
                return new p2.g(0, intValue2 - ((int) (4294967295L & j13)));
            case 12:
                Integer b10 = r0Var.b();
                if (b10 == null) {
                    return null;
                }
                int intValue3 = b10.intValue();
                long j14 = r0Var.f23768f;
                int i14 = j2.f0.f20711c;
                return new p2.g(((int) (4294967295L & j14)) - intValue3, 0);
            default:
                Integer a10 = r0Var.a();
                if (a10 == null) {
                    return null;
                }
                int intValue4 = a10.intValue();
                long j15 = r0Var.f23768f;
                int i15 = j2.f0.f20711c;
                return new p2.g(0, intValue4 - ((int) (4294967295L & j15)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y.g1 g1Var;
        int i10 = this.f19175a;
        switch (i10) {
            case 0:
                return Long.valueOf(((Number) obj).longValue());
            case 1:
                return Unit.f23355a;
            case 2:
                return Unit.f23355a;
            case 3:
                return Unit.f23355a;
            case 4:
                w.v0 v0Var = (w.v0) obj;
                v0Var.f38725a = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                v0Var.a(0, Float.valueOf(1.0f));
                v0Var.a(499, Float.valueOf(1.0f));
                v0Var.a(500, Float.valueOf(s0.g.f34069a));
                v0Var.a(999, Float.valueOf(s0.g.f34069a));
                return Unit.f23355a;
            case 5:
                return Unit.f23355a;
            case 6:
                l0.r0 r0Var = (l0.r0) obj;
                switch (i10) {
                    case 6:
                        l0.a1 a1Var = r0Var.f23767e;
                        a1Var.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str = r0Var.f23769g.f20699a;
                                    long j10 = r0Var.f23768f;
                                    int i11 = j2.f0.f20711c;
                                    Object obj2 = q4.a.f31656a;
                                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                    characterInstance.setText(str);
                                    int preceding = characterInstance.preceding((int) (4294967295L & j10));
                                    if (preceding != -1) {
                                        r0Var.l(preceding, preceding);
                                        break;
                                    }
                                }
                            } else {
                                a1Var.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str2 = r0Var.f23769g.f20699a;
                                    long j11 = r0Var.f23768f;
                                    int i12 = j2.f0.f20711c;
                                    Object obj3 = q4.a.f31656a;
                                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                                    characterInstance2.setText(str2);
                                    int following = characterInstance2.following((int) (4294967295L & j11));
                                    if (following != -1) {
                                        r0Var.l(following, following);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        l0.a1 a1Var2 = r0Var.f23767e;
                        a1Var2.f23709a = null;
                        if (r0Var.f23769g.f20699a.length() > 0) {
                            if (r0Var.e()) {
                                a1Var2.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str3 = r0Var.f23769g.f20699a;
                                    long j12 = r0Var.f23768f;
                                    int i13 = j2.f0.f20711c;
                                    Object obj4 = q4.a.f31656a;
                                    BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                                    characterInstance3.setText(str3);
                                    int following2 = characterInstance3.following((int) (4294967295L & j12));
                                    if (following2 != -1) {
                                        r0Var.l(following2, following2);
                                        break;
                                    }
                                }
                            } else {
                                a1Var2.f23709a = null;
                                if (r0Var.f23769g.f20699a.length() > 0) {
                                    String str4 = r0Var.f23769g.f20699a;
                                    long j13 = r0Var.f23768f;
                                    int i14 = j2.f0.f20711c;
                                    Object obj5 = q4.a.f31656a;
                                    BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
                                    characterInstance4.setText(str4);
                                    int preceding2 = characterInstance4.preceding((int) (4294967295L & j13));
                                    if (preceding2 != -1) {
                                        r0Var.l(preceding2, preceding2);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f23355a;
            case 7:
                l0.r0 r0Var2 = (l0.r0) obj;
                switch (i10) {
                    case 6:
                        l0.a1 a1Var3 = r0Var2.f23767e;
                        a1Var3.f23709a = null;
                        if (r0Var2.f23769g.f20699a.length() > 0) {
                            if (r0Var2.e()) {
                                a1Var3.f23709a = null;
                                if (r0Var2.f23769g.f20699a.length() > 0) {
                                    String str5 = r0Var2.f23769g.f20699a;
                                    long j14 = r0Var2.f23768f;
                                    int i15 = j2.f0.f20711c;
                                    Object obj6 = q4.a.f31656a;
                                    BreakIterator characterInstance5 = BreakIterator.getCharacterInstance();
                                    characterInstance5.setText(str5);
                                    int preceding3 = characterInstance5.preceding((int) (4294967295L & j14));
                                    if (preceding3 != -1) {
                                        r0Var2.l(preceding3, preceding3);
                                        break;
                                    }
                                }
                            } else {
                                a1Var3.f23709a = null;
                                if (r0Var2.f23769g.f20699a.length() > 0) {
                                    String str6 = r0Var2.f23769g.f20699a;
                                    long j15 = r0Var2.f23768f;
                                    int i16 = j2.f0.f20711c;
                                    Object obj7 = q4.a.f31656a;
                                    BreakIterator characterInstance6 = BreakIterator.getCharacterInstance();
                                    characterInstance6.setText(str6);
                                    int following3 = characterInstance6.following((int) (4294967295L & j15));
                                    if (following3 != -1) {
                                        r0Var2.l(following3, following3);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        l0.a1 a1Var4 = r0Var2.f23767e;
                        a1Var4.f23709a = null;
                        if (r0Var2.f23769g.f20699a.length() > 0) {
                            if (r0Var2.e()) {
                                a1Var4.f23709a = null;
                                if (r0Var2.f23769g.f20699a.length() > 0) {
                                    String str7 = r0Var2.f23769g.f20699a;
                                    long j16 = r0Var2.f23768f;
                                    int i17 = j2.f0.f20711c;
                                    Object obj8 = q4.a.f31656a;
                                    BreakIterator characterInstance7 = BreakIterator.getCharacterInstance();
                                    characterInstance7.setText(str7);
                                    int following4 = characterInstance7.following((int) (4294967295L & j16));
                                    if (following4 != -1) {
                                        r0Var2.l(following4, following4);
                                        break;
                                    }
                                }
                            } else {
                                a1Var4.f23709a = null;
                                if (r0Var2.f23769g.f20699a.length() > 0) {
                                    String str8 = r0Var2.f23769g.f20699a;
                                    long j17 = r0Var2.f23768f;
                                    int i18 = j2.f0.f20711c;
                                    Object obj9 = q4.a.f31656a;
                                    BreakIterator characterInstance8 = BreakIterator.getCharacterInstance();
                                    characterInstance8.setText(str8);
                                    int preceding4 = characterInstance8.preceding((int) (4294967295L & j17));
                                    if (preceding4 != -1) {
                                        r0Var2.l(preceding4, preceding4);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f23355a;
            case 8:
                return a((l0.r0) obj);
            case 9:
                return a((l0.r0) obj);
            case 10:
                return a((l0.r0) obj);
            case 11:
                return a((l0.r0) obj);
            case 12:
                return a((l0.r0) obj);
            case 13:
                return a((l0.r0) obj);
            default:
                List list = (List) obj;
                Object obj10 = list.get(1);
                Intrinsics.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj10).booleanValue()) {
                    g1Var = y.g1.f40723a;
                } else {
                    g1Var = y.g1.f40724b;
                }
                Object obj11 = list.get(0);
                Intrinsics.d(obj11, "null cannot be cast to non-null type kotlin.Float");
                return new q2(g1Var, ((Float) obj11).floatValue());
        }
    }
}
