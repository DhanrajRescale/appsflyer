package hq;

import iq.f;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements fq.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18667a;

    @Override // fq.b
    public final void encode(Object obj, Object obj2) {
        switch (this.f18667a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                fq.e eVar = (fq.e) obj2;
                Charset charset = f.f20483f;
                eVar.d(f.f20484g, entry.getKey());
                eVar.d(f.f20485h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
