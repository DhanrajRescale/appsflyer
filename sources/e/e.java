package e;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f14617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f14618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14619d;

    public /* synthetic */ e(Object obj, Serializable serializable, f.a aVar, int i10) {
        this.f14616a = i10;
        this.f14619d = obj;
        this.f14617b = serializable;
        this.f14618c = aVar;
    }

    @Override // e.c
    public final void a(Object obj) {
        int i10 = this.f14616a;
        f.a aVar = this.f14618c;
        Object obj2 = this.f14619d;
        Serializable serializable = this.f14617b;
        switch (i10) {
            case 0:
                h hVar = (h) obj2;
                String str = (String) serializable;
                Integer num = (Integer) hVar.f14626c.get(str);
                if (num != null) {
                    hVar.f14628e.add(str);
                    try {
                        ((h) obj2).b(num.intValue(), aVar, obj);
                        return;
                    } catch (Exception e10) {
                        hVar.f14628e.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                h hVar2 = (h) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) hVar2.f14626c.get(str2);
                if (num2 != null) {
                    hVar2.f14628e.add(str2);
                    try {
                        ((h) obj2).b(num2.intValue(), aVar, obj);
                        return;
                    } catch (Exception e11) {
                        hVar2.f14628e.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                c cVar = (c) ((AtomicReference) serializable).get();
                if (cVar != null) {
                    cVar.a(obj);
                    return;
                }
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // e.c
    public final void b() {
        int i10 = this.f14616a;
        Object obj = this.f14619d;
        Serializable serializable = this.f14617b;
        switch (i10) {
            case 0:
                ((h) obj).f((String) serializable);
                return;
            case 1:
                ((h) obj).f((String) serializable);
                return;
            default:
                c cVar = (c) ((AtomicReference) serializable).getAndSet(null);
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
