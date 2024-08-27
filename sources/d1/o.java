package d1;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f13282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f13284c;

    public o(p pVar, String str, Function0 function0) {
        this.f13282a = pVar;
        this.f13283b = str;
        this.f13284c = function0;
    }

    public final void a() {
        p pVar = this.f13282a;
        LinkedHashMap linkedHashMap = pVar.f13287c;
        String str = this.f13283b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove(this.f13284c);
        }
        if (list != null && (!list.isEmpty())) {
            pVar.f13287c.put(str, list);
        }
    }
}
