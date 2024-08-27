package h2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import vt.g0;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final q f17867b = new q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q f17868c = new q(1);

    /* renamed from: d, reason: collision with root package name */
    public static final q f17869d = new q(2);

    /* renamed from: e, reason: collision with root package name */
    public static final q f17870e = new q(3);

    /* renamed from: f, reason: collision with root package name */
    public static final q f17871f = new q(4);

    /* renamed from: g, reason: collision with root package name */
    public static final q f17872g = new q(5);

    /* renamed from: h, reason: collision with root package name */
    public static final q f17873h = new q(6);

    /* renamed from: i, reason: collision with root package name */
    public static final q f17874i = new q(7);

    /* renamed from: j, reason: collision with root package name */
    public static final q f17875j = new q(8);

    /* renamed from: k, reason: collision with root package name */
    public static final q f17876k = new q(9);

    /* renamed from: l, reason: collision with root package name */
    public static final q f17877l = new q(10);

    /* renamed from: m, reason: collision with root package name */
    public static final q f17878m = new q(11);

    /* renamed from: n, reason: collision with root package name */
    public static final q f17879n = new q(12);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(2);
        this.f17880a = i10;
    }

    public final void a(Unit unit) {
        switch (this.f17880a) {
            case 1:
                return;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                return;
            default:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList S;
        ArrayList S2;
        String str;
        ut.d dVar;
        int i10 = this.f17880a;
        switch (i10) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                switch (i10) {
                    case 0:
                        if (list != null) {
                            S = g0.S(list);
                            S.addAll(list2);
                            break;
                        } else {
                            return list2;
                        }
                    default:
                        if (list != null) {
                            S = g0.S(list);
                            S.addAll(list2);
                            break;
                        } else {
                            return list2;
                        }
                }
                return S;
            case 1:
                Unit unit = (Unit) obj;
                a(unit);
                return unit;
            case 2:
                Unit unit2 = (Unit) obj;
                a(unit2);
                return unit2;
            case 3:
                Unit unit3 = (Unit) obj;
                a(unit3);
                return unit3;
            case 4:
                Unit unit4 = (Unit) obj;
                a(unit4);
                return unit4;
            case 5:
                String str2 = (String) obj;
                switch (i10) {
                    case 5:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str2;
                }
            case 6:
                g gVar = (g) obj;
                int i11 = ((g) obj2).f17821a;
                return gVar;
            case 7:
                String str3 = (String) obj;
                switch (i10) {
                    case 5:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str3;
                }
            case 8:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                switch (i10) {
                    case 0:
                        if (list3 != null) {
                            S2 = g0.S(list3);
                            S2.addAll(list4);
                            break;
                        } else {
                            return list4;
                        }
                    default:
                        if (list3 != null) {
                            S2 = g0.S(list3);
                            S2.addAll(list4);
                            break;
                        } else {
                            return list4;
                        }
                }
                return S2;
            case 9:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 10:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 11:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f17809a) == null) {
                    str = aVar2.f17809a;
                }
                if (aVar == null || (dVar = aVar.f17810b) == null) {
                    dVar = aVar2.f17810b;
                }
                return new a(str, dVar);
            default:
                if (obj == null) {
                    return obj2;
                }
                return obj;
        }
    }
}
