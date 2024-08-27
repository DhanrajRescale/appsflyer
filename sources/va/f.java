package va;

import au.i;
import com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class f extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f37827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketAdvancedSearchViewModel f37828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MarketAdvancedSearchViewModel marketAdvancedSearchViewModel, yt.a aVar) {
        super(2, aVar);
        this.f37828b = marketAdvancedSearchViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f37828b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r8.getMorePresent() == true) goto L33;
     */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r7.f37827a
            com.assetgro.stockgro.feature_market.presentation.market.search.MarketAdvancedSearchViewModel r2 = r7.f37828b
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            ut.n.b(r8)     // Catch: java.lang.Exception -> L85
            goto L32
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            ut.n.b(r8)
            com.assetgro.stockgro.data.repository.FnoRepository r8 = r2.f8687n     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = r2.f8693t     // Catch: java.lang.Exception -> L85
            va.e r4 = r2.f8692s     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = r4.f37826a     // Catch: java.lang.Exception -> L85
            int r5 = r2.f8695v     // Catch: java.lang.Exception -> L85
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Exception -> L85
            r6.<init>(r5)     // Catch: java.lang.Exception -> L85
            r7.f37827a = r3     // Catch: java.lang.Exception -> L85
            java.lang.Object r8 = r8.getMarketSearchData(r1, r4, r6, r7)     // Catch: java.lang.Exception -> L85
            if (r8 != r0) goto L32
            return r0
        L32:
            nv.v0 r8 = (nv.v0) r8     // Catch: java.lang.Exception -> L85
            okhttp3.Response r0 = r8.f29302a     // Catch: java.lang.Exception -> L85
            boolean r0 = r0.isSuccessful()     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L7d
            androidx.lifecycle.e0 r0 = r2.f9084g     // Catch: java.lang.Exception -> L85
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L85
            r0.postValue(r1)     // Catch: java.lang.Exception -> L85
            java.lang.Object r8 = r8.f29303b     // Catch: java.lang.Exception -> L85
            com.assetgro.stockgro.data.model.MarketSearchResponseDto r8 = (com.assetgro.stockgro.data.model.MarketSearchResponseDto) r8     // Catch: java.lang.Exception -> L85
            if (r8 == 0) goto L94
            com.assetgro.stockgro.data.model.MarketSearchResponseData r8 = r8.getMarketSearchResponseData()     // Catch: java.lang.Exception -> L85
            if (r8 == 0) goto L94
            androidx.lifecycle.e0 r0 = r2.f8688o     // Catch: java.lang.Exception -> L85
            r0.postValue(r8)     // Catch: java.lang.Exception -> L85
            va.e r0 = va.e.f37823c     // Catch: java.lang.Exception -> L85
            va.e r1 = r2.f8692s     // Catch: java.lang.Exception -> L85
            r4 = 0
            if (r0 != r1) goto L6a
            com.assetgro.stockgro.data.model.MarketSearchRecords r8 = r8.getStocks()     // Catch: java.lang.Exception -> L85
            if (r8 == 0) goto L68
            boolean r8 = r8.getMorePresent()     // Catch: java.lang.Exception -> L85
            if (r8 != r3) goto L68
            goto L7a
        L68:
            r3 = r4
            goto L7a
        L6a:
            va.e r0 = va.e.f37824d     // Catch: java.lang.Exception -> L85
            if (r0 != r1) goto L68
            com.assetgro.stockgro.data.model.MarketSearchRecords r8 = r8.getOptions()     // Catch: java.lang.Exception -> L85
            if (r8 == 0) goto L68
            boolean r8 = r8.getMorePresent()     // Catch: java.lang.Exception -> L85
            if (r8 != r3) goto L68
        L7a:
            r2.f8694u = r3     // Catch: java.lang.Exception -> L85
            goto L94
        L7d:
            androidx.lifecycle.e0 r8 = r2.f9084g     // Catch: java.lang.Exception -> L85
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L85
            r8.postValue(r0)     // Catch: java.lang.Exception -> L85
            goto L94
        L85:
            androidx.lifecycle.e0 r8 = r2.f9084g
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.postValue(r0)
            androidx.lifecycle.e0 r8 = r2.f9082e
            r0 = 2132018164(0x7f1403f4, float:1.9674627E38)
            v.e.r(r0, r8)
        L94:
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: va.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
