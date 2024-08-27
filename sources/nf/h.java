package nf;

import android.content.Context;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.android.gms.common.internal.Preconditions;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.services.HyperServices;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;
import qu.f0;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28645a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MainActivity mainActivity, yt.a aVar) {
        super(2, aVar);
        this.f28645a = mainActivity;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f28645a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        MainActivity mainActivity = this.f28645a;
        Context applicationContext = mainActivity.getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(PaymentConstants.CLIENT_ID_CAMEL, "stockgro_android");
            jSONObject.put(PaymentConstants.PAYLOAD, jSONObject2);
            jSONObject.put("requestId", UUID.randomUUID().toString());
            jSONObject.put(PaymentConstants.SERVICE, "in.juspay.hyperpay");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        HyperServices.preFetch(applicationContext, jSONObject);
        Object obj2 = nq.c.f29079m;
        pp.g d10 = pp.g.d();
        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
        ((nq.c) d10.b(nq.d.class)).d().addOnCompleteListener(new b3.t(mainActivity, 1));
        return Unit.f23355a;
    }
}
