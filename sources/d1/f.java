package d1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import vt.p0;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f13261b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f13262c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(2);
        this.f13263a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13263a) {
            case 0:
                k kVar = (k) obj2;
                LinkedHashMap m10 = p0.m(kVar.f13276a);
                for (i iVar : kVar.f13277b.values()) {
                    if (iVar.f13269b) {
                        Map b10 = iVar.f13270c.b();
                        boolean isEmpty = b10.isEmpty();
                        Object obj3 = iVar.f13268a;
                        if (isEmpty) {
                            m10.remove(obj3);
                        } else {
                            m10.put(obj3, b10);
                        }
                    }
                }
                if (m10.isEmpty()) {
                    return null;
                }
                return m10;
            default:
                return obj2;
        }
    }
}
