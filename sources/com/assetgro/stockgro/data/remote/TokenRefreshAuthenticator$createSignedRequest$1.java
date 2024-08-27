package com.assetgro.stockgro.data.remote;

import au.e;
import au.i;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.TokenRefreshResponseDto;
import iu.z;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import yt.a;

@e(c = "com.assetgro.stockgro.data.remote.TokenRefreshAuthenticator$createSignedRequest$1", f = "TokenRefreshAuthenticator.kt", l = {50}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqu/f0;", "Lokhttp3/Request;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TokenRefreshAuthenticator$createSignedRequest$1 extends i implements Function2<f0, a<? super Request>, Object> {
    final /* synthetic */ z $accessToken;
    final /* synthetic */ Response $this_createSignedRequest;
    int label;
    final /* synthetic */ TokenRefreshAuthenticator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenRefreshAuthenticator$createSignedRequest$1(TokenRefreshAuthenticator tokenRefreshAuthenticator, Response response, z zVar, a<? super TokenRefreshAuthenticator$createSignedRequest$1> aVar) {
        super(2, aVar);
        this.this$0 = tokenRefreshAuthenticator;
        this.$this_createSignedRequest = response;
        this.$accessToken = zVar;
    }

    @Override // au.a
    @NotNull
    public final a<Unit> create(Object obj, @NotNull a<?> aVar) {
        return new TokenRefreshAuthenticator$createSignedRequest$1(this.this$0, this.$this_createSignedRequest, this.$accessToken, aVar);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        LogoutSubject logoutSubject;
        TokenRefreshResponseDto tokenRefreshResponseDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            NetworkService networkService = this.this$0.getNetworkService();
            String uuid = this.this$0.getUserPreferences().getUuid();
            this.label = 1;
            obj = networkService.updateTokenV2(uuid, "220", this);
            if (obj == aVar) {
                return aVar;
            }
        }
        v0 v0Var = (v0) obj;
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseV2Dto baseResponseV2Dto = (BaseResponseV2Dto) v0Var.f29303b;
            if (baseResponseV2Dto != null && (tokenRefreshResponseDto = (TokenRefreshResponseDto) baseResponseV2Dto.getData()) != null) {
                TokenRefreshAuthenticator tokenRefreshAuthenticator = this.this$0;
                z zVar = this.$accessToken;
                tokenRefreshAuthenticator.getUserPreferences().setAccessToken(tokenRefreshResponseDto.getAccessToken(), true);
                tokenRefreshAuthenticator.getUserPreferences().setDateOfAccessTokenUpdate(new Date());
                tokenRefreshAuthenticator.getUserPreferences().setUserRole(tokenRefreshResponseDto.getUserRole(), true);
                zVar.f20560a = tokenRefreshResponseDto.getAccessToken();
            }
        } else if (v0Var.f29302a.code() == 401) {
            this.this$0.getUserPreferences().setAccessToken(null, true);
            this.this$0.getUserPreferences().clearPreferences();
            logoutSubject = this.this$0.logoutSubject;
            logoutSubject.signalLogout();
        }
        return TokenRefreshAuthenticatorKt.signWithToken(this.$this_createSignedRequest.request(), this.this$0.getSessionId(), (String) this.$accessToken.f20560a, this.this$0.getUserPreferences());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull f0 f0Var, a<? super Request> aVar) {
        return ((TokenRefreshAuthenticator$createSignedRequest$1) create(f0Var, aVar)).invokeSuspend(Unit.f23355a);
    }
}
