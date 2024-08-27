package fv;

import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.WebSocket;

/* loaded from: classes2.dex */
public final class l extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f16310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f16313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f16314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, String str2, Map map, String str3, String str4) {
        super(0);
        this.f16310a = mVar;
        this.f16311b = str;
        this.f16312c = str2;
        this.f16313d = map;
        this.f16314e = str3;
        this.f16315f = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("topic", this.f16311b);
        linkedHashMap.put("event", this.f16312c);
        linkedHashMap.put(PaymentConstants.PAYLOAD, this.f16313d);
        String str = this.f16314e;
        if (str != null) {
            linkedHashMap.put("ref", str);
        }
        String str2 = this.f16315f;
        if (str2 != null) {
            linkedHashMap.put("join_ref", str2);
        }
        m mVar = this.f16310a;
        String data = mVar.f16334s.toJson(linkedHashMap);
        o oVar = mVar.f16333r;
        if (oVar != null) {
            mVar.d("Push: Sending " + data);
            Intrinsics.b(data, "data");
            WebSocket webSocket = oVar.f16341a;
            if (webSocket != null) {
                webSocket.send(data);
            }
        }
        return Unit.f23355a;
    }
}
