package com.assetgro.stockgro.data.repository;

import at.m;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.KycEmailSupportRequestDto;
import com.assetgro.stockgro.data.model.KycFAQResponse;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.data.model.MySubscriptionResponse;
import com.assetgro.stockgro.data.model.RedeemedOffers;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.data.model.SubscriptionPlanConfirmationResponse;
import com.assetgro.stockgro.data.model.TicketData;
import com.assetgro.stockgro.data.model.WalletTransactionsDto;
import com.assetgro.stockgro.data.model.portfolio.WalletBalanceResponseDto;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.JusPayInitiateRequest;
import com.assetgro.stockgro.data.remote.request.JusPayTransactionStatusRequest;
import com.assetgro.stockgro.data.remote.request.PinLoginRequestDto;
import com.assetgro.stockgro.data.remote.request.SubscriptionPlanPurchaseRequestDto;
import com.assetgro.stockgro.data.remote.request.TransactionStatusRequestDto;
import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import com.assetgro.stockgro.data.remote.request.WithdrawProcessDto;
import com.assetgro.stockgro.data.remote.response.AddResponse;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.ConfigDto;
import com.assetgro.stockgro.data.remote.response.JusPayInitiateResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionDowngradePromptResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionMaintenanceResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionNudgeResponse;
import com.assetgro.stockgro.data.remote.response.SubscriptionPurchaseResponse;
import com.assetgro.stockgro.data.remote.response.TransactionDetailResponse;
import com.assetgro.stockgro.data.remote.response.TransactionStatusResponse;
import com.assetgro.stockgro.data.remote.response.WithdrawInitiateResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawOtpRegenerateResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawProcessResponseDto;
import com.assetgro.stockgro.data.remote.response.WithdrawableLimitDto;
import dg.d;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bq\u0010rJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J6\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u0002J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\"\u0010\u0017\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00160\u00030\u0002J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u0006J\"\u0010\u001b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\u0014j\b\u0012\u0004\u0012\u00020\u001a`\u00160\u00030\u0002J\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u0006J\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00030\u0002JQ\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010'J@\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00062\"\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`*J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0002J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u0002J\u001c\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u000bH\u0086@¢\u0006\u0004\b2\u00103J.\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206000\u000b2\u0006\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020!H\u0086@¢\u0006\u0004\b7\u00108J6\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:000\u000b2\u0006\u00109\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b;\u0010<J$\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=000\u000b2\u0006\u00104\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b>\u0010?J\u0012\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00030\u0002J&\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00022\b\u0010B\u001a\u0004\u0018\u00010\u00062\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u0006J$\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00030\u000b2\u0006\u0010H\u001a\u00020\u0006H\u0086@¢\u0006\u0004\bJ\u0010?J&\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L000\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\bM\u0010?J\u001c\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u00030\u000bH\u0086@¢\u0006\u0004\bO\u00103J\u001c\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P000\u000bH\u0086@¢\u0006\u0004\bQ\u00103JB\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u00022\b\u0010R\u001a\u0004\u0018\u00010\u00062\b\u0010S\u001a\u0004\u0018\u00010\u00062\b\u0010T\u001a\u0004\u0018\u00010\u00062\b\u0010U\u001a\u0004\u0018\u00010\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060VJ\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0\u000bH\u0086@¢\u0006\u0004\bZ\u00103J\u001c\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u00030\u000bH\u0086@¢\u0006\u0004\b\\\u00103J$\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00030\u000b2\u0006\u0010^\u001a\u00020]H\u0086@¢\u0006\u0004\b`\u0010aJ$\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00030\u000b2\u0006\u0010c\u001a\u00020bH\u0086@¢\u0006\u0004\be\u0010fJ\u001c\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\u00030\u000bH\u0086@¢\u0006\u0004\bh\u00103J$\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00030\u000b2\u0006\u0010(\u001a\u00020\u0006H\u0086@¢\u0006\u0004\bj\u0010?R\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/assetgro/stockgro/data/repository/PaymentRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "Lat/m;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/data/model/portfolio/WalletBalanceResponseDto;", "getWalletBalance", HttpUrl.FRAGMENT_ENCODE_SET, "pageNumber", "wallet", "Ldg/d;", "paymentFilterOptions", "Lnv/v0;", "Lcom/assetgro/stockgro/data/model/WalletTransactionsDto;", "getWalletTransactions", "(Ljava/lang/String;Ljava/lang/String;Ldg/d;Lyt/a;)Ljava/lang/Object;", "pin", "pinVerify", "Lcom/assetgro/stockgro/data/remote/response/ConfigDto;", "getConfig", "uuid", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/RedemptionOffer;", "Lkotlin/collections/ArrayList;", "getCoupons", "couponId", "getCouponDetails", "Lcom/assetgro/stockgro/data/model/RedeemedOffers;", "getRedeemed", "purchaseCoupon", "Lcom/assetgro/stockgro/data/remote/response/JusPayInitiateResponse;", "initiateJustPayPayload", HttpUrl.FRAGMENT_ENCODE_SET, PaymentConstants.AMOUNT, HttpUrl.FRAGMENT_ENCODE_SET, "enableOnlyUpi", "flow", "planId", "planName", "processJustPayPayload", "(Ljava/lang/Float;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lat/m;", "transactionId", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "response", "updateJustPayTransactionStatus", "Lcom/assetgro/stockgro/data/model/KycResponseDto;", "createKyc", "getKyc", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", "Lcom/assetgro/stockgro/data/model/MySubscriptionResponse;", "getMySubscription", "(Lyt/a;)Ljava/lang/Object;", "packageId", "mandateSetup", "Lcom/assetgro/stockgro/data/model/SubscriptionPlanConfirmationResponse;", "getSubscriptionConfirmation", "(Ljava/lang/String;ZLyt/a;)Ljava/lang/Object;", "pgRoute", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionPurchaseResponse;", "purchaseSubscriptionPlan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionDowngradePromptResponse;", "getPackageDowngrade", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/KycFAQResponse;", "getKycFaqs", "assetId", "Ljava/io/File;", "file", "type", "Lcom/assetgro/stockgro/data/remote/response/AssetUploadResponse;", "uploadKycFaqAssets", PaymentConstants.ORDER_ID_CAMEL, "Lcom/assetgro/stockgro/data/remote/response/TransactionStatusResponse;", "getTransactionStatus", "screenTag", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionNudgeResponse;", "getSubscriptionPrompt", "Lcom/assetgro/stockgro/data/remote/response/AddResponse;", "getAddData", "Lcom/assetgro/stockgro/data/remote/response/SubscriptionMaintenanceResponse;", "getSubwayMaintenance", "kycStatus", "userEmail", "phoneNumber", "description", HttpUrl.FRAGMENT_ENCODE_SET, "attachmentLinks", "Lcom/assetgro/stockgro/data/model/KycSupportTicketResponseDto;", "createKycSupportTicket", "getKycTicketStatus", "Lcom/assetgro/stockgro/data/remote/response/WithdrawableLimitDto;", "getWalletLimit", "Lcom/assetgro/stockgro/data/remote/request/WithdrawInitiateDto;", "withdrawInitiateDto", "Lcom/assetgro/stockgro/data/remote/response/WithdrawInitiateResponseDto;", "withdrawInitiate", "(Lcom/assetgro/stockgro/data/remote/request/WithdrawInitiateDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/request/WithdrawProcessDto;", "withdrawProcessDto", "Lcom/assetgro/stockgro/data/remote/response/WithdrawProcessResponseDto;", "withdrawProcess", "(Lcom/assetgro/stockgro/data/remote/request/WithdrawProcessDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/remote/response/WithdrawOtpRegenerateResponseDto;", "resendOtp", "Lcom/assetgro/stockgro/data/remote/response/TransactionDetailResponse;", "getTransactionDetails", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "<init>", "(Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PaymentRepository {
    public static final int $stable = 8;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public PaymentRepository(@NotNull NetworkService networkService, @NotNull UserPreferences userPreferences) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.networkService = networkService;
        this.userPreferences = userPreferences;
    }

    public static /* synthetic */ Object getSubscriptionConfirmation$default(PaymentRepository paymentRepository, String str, boolean z10, yt.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return paymentRepository.getSubscriptionConfirmation(str, z10, aVar);
    }

    public static /* synthetic */ m processJustPayPayload$default(PaymentRepository paymentRepository, Float f10, boolean z10, String str, String str2, String str3, int i10, Object obj) {
        String str4;
        String str5;
        String str6;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i10 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i10 & 16) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        return paymentRepository.processJustPayPayload(f10, z11, str4, str5, str6);
    }

    @NotNull
    public final m<KycResponseDto> createKyc() {
        return this.networkService.createKyc(this.userPreferences.getUuid());
    }

    @NotNull
    public final m<KycSupportTicketResponseDto> createKycSupportTicket(String kycStatus, String userEmail, String phoneNumber, String description, @NotNull List<String> attachmentLinks) {
        Intrinsics.checkNotNullParameter(attachmentLinks, "attachmentLinks");
        return this.networkService.createKycSupportTicket(kycStatus, new KycEmailSupportRequestDto(phoneNumber, new TicketData(userEmail, description, attachmentLinks)));
    }

    public final Object getAddData(@NotNull yt.a<? super v0<BaseResponseDto<AddResponse>>> aVar) {
        return this.networkService.getAddData(aVar);
    }

    @NotNull
    public final m<BaseResponseDto<ConfigDto>> getConfig() {
        return this.networkService.getConfig(this.userPreferences.getUuid());
    }

    @NotNull
    public final m<BaseResponseDto<RedemptionOffer>> getCouponDetails(@NotNull String couponId) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        return this.networkService.getCouponDetails(couponId);
    }

    @NotNull
    public final m<BaseResponseDto<ArrayList<RedemptionOffer>>> getCoupons() {
        return this.networkService.getCoupons();
    }

    @NotNull
    public final m<KycResponseDto> getKyc() {
        return this.networkService.getKyc(this.userPreferences.getUuid());
    }

    @NotNull
    public final m<BaseResponseDto<KycFAQResponse>> getKycFaqs() {
        return this.networkService.getKycFaqs();
    }

    public final Object getKycTicketStatus(@NotNull yt.a<? super v0<KycSupportTicketResponseDto>> aVar) {
        return this.networkService.getKycTicketStatus(aVar);
    }

    public final Object getMySubscription(@NotNull yt.a<? super v0<BaseResponseV2Dto<MySubscriptionResponse>>> aVar) {
        return this.networkService.getMySubscription(aVar);
    }

    public final Object getPackageDowngrade(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<SubscriptionDowngradePromptResponse>>> aVar) {
        return this.networkService.getPackageDowngrade(str, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<ArrayList<RedeemedOffers>>> getRedeemed() {
        return this.networkService.getRedeemed();
    }

    public final Object getSubscriptionConfirmation(@NotNull String str, boolean z10, @NotNull yt.a<? super v0<BaseResponseV2Dto<SubscriptionPlanConfirmationResponse>>> aVar) {
        return this.networkService.getSubscriptionConfirmation(str, z10, aVar);
    }

    public final Object getSubscriptionPrompt(String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<SubscriptionNudgeResponse>>> aVar) {
        return this.networkService.getSubscriptionPrompt(str, aVar);
    }

    public final Object getSubwayMaintenance(@NotNull yt.a<? super v0<BaseResponseV2Dto<SubscriptionMaintenanceResponse>>> aVar) {
        return this.networkService.getSubwayMaintenance(aVar);
    }

    public final Object getTransactionDetails(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<TransactionDetailResponse>>> aVar) {
        return this.networkService.getTransactionDetails(str, aVar);
    }

    public final Object getTransactionStatus(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<TransactionStatusResponse>>> aVar) {
        return this.networkService.getTransactionStatus(new TransactionStatusRequestDto(str), aVar);
    }

    @NotNull
    public final m<BaseResponseDto<WalletBalanceResponseDto>> getWalletBalance() {
        return this.networkService.getWalletBalance();
    }

    public final Object getWalletLimit(@NotNull yt.a<? super v0<BaseResponseDto<WithdrawableLimitDto>>> aVar) {
        return this.networkService.getWalletLimit(aVar);
    }

    public final Object getWalletTransactions(@NotNull String str, String str2, @NotNull d dVar, @NotNull yt.a<? super v0<BaseResponseDto<WalletTransactionsDto>>> aVar) {
        return this.networkService.getWalletTransactions(str, str2, dVar.f14343a, dVar.f14347e, dVar.f14348f, dVar.f14344b, dVar.f14345c, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<JusPayInitiateResponse>> initiateJustPayPayload() {
        return this.networkService.initiateJustPayPayload(new JusPayInitiateRequest(this.userPreferences.getPhoneNumber(), LogSubCategory.LifeCycle.ANDROID, null, false, null, null, null));
    }

    @NotNull
    public final m<BaseResponseDto<Object>> pinVerify(@NotNull String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return this.networkService.withdrawalPinVerify(new PinLoginRequestDto(pin));
    }

    @NotNull
    public final m<BaseResponseDto<Object>> processJustPayPayload(Float amount, boolean enableOnlyUpi, String flow, String planId, String planName) {
        return this.networkService.processJustPayPayload(new JusPayInitiateRequest(this.userPreferences.getPhoneNumber(), LogSubCategory.LifeCycle.ANDROID, amount, enableOnlyUpi, flow, planId, planName));
    }

    @NotNull
    public final m<BaseResponseDto<Object>> purchaseCoupon(@NotNull String couponId) {
        Intrinsics.checkNotNullParameter(couponId, "couponId");
        return this.networkService.purchaseCoupon(couponId);
    }

    public final Object purchaseSubscriptionPlan(@NotNull String str, @NotNull String str2, String str3, @NotNull yt.a<? super v0<BaseResponseV2Dto<SubscriptionPurchaseResponse>>> aVar) {
        return this.networkService.purchaseSubscriptionPlan(new SubscriptionPlanPurchaseRequestDto(str, str2, str3), aVar);
    }

    public final Object resendOtp(@NotNull yt.a<? super v0<BaseResponseDto<WithdrawOtpRegenerateResponseDto>>> aVar) {
        return this.networkService.resendOtp("Empty", aVar);
    }

    @NotNull
    public final m<BaseResponseDto<Object>> updateJustPayTransactionStatus(String transactionId, @NotNull HashMap<String, String> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return this.networkService.updateJustPayTransactionStatus(new JusPayTransactionStatusRequest(transactionId, response));
    }

    @NotNull
    public final m<AssetUploadResponse> uploadKycFaqAssets(String assetId, @NotNull File file, @NotNull String type) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.networkService.uploadKycFaqAssets(assetId, MultipartBody.Part.INSTANCE.createFormData("media", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(type))));
    }

    public final String uuid() {
        return this.userPreferences.getUuid();
    }

    public final Object withdrawInitiate(@NotNull WithdrawInitiateDto withdrawInitiateDto, @NotNull yt.a<? super v0<BaseResponseDto<WithdrawInitiateResponseDto>>> aVar) {
        return this.networkService.withdrawInitiate(withdrawInitiateDto, aVar);
    }

    public final Object withdrawProcess(@NotNull WithdrawProcessDto withdrawProcessDto, @NotNull yt.a<? super v0<BaseResponseDto<WithdrawProcessResponseDto>>> aVar) {
        return this.networkService.withdrawProcess(withdrawProcessDto, aVar);
    }
}
