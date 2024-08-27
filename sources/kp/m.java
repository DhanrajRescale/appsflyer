package kp;

import com.google.android.gms.common.api.Api;
import ek.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public final u f23453b;

    /* renamed from: a, reason: collision with root package name */
    public final a f23452a = d.f23430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23454c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public m(u uVar) {
        this.f23453b = uVar;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        u uVar = this.f23453b;
        uVar.getClass();
        k kVar = new k(uVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (kVar.hasNext()) {
            arrayList.add((String) kVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
