package com.assetgro.stockgro.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import at.m;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.local.preference.GlobalUserPreferences;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.model.AccountDeleteRequest;
import com.assetgro.stockgro.data.model.AccountDeleteResponse;
import com.assetgro.stockgro.data.model.CountriesDto;
import com.assetgro.stockgro.data.model.FeedbackRequestDto;
import com.assetgro.stockgro.data.model.FollowerFollowingData;
import com.assetgro.stockgro.data.model.GeoDto;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.InvitedFriendDto;
import com.assetgro.stockgro.data.model.ProfileStatsDto;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.data.model.UserBlockStatusDao;
import com.assetgro.stockgro.data.model.UserSocialAuthStatusDto;
import com.assetgro.stockgro.data.model.VideoTutorialDataResponse;
import com.assetgro.stockgro.data.model.homedata.ScrollDepth;
import com.assetgro.stockgro.data.model.socialgroups.SocialGroupsItem;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.data.remote.request.NotificationIdUpdateDto;
import com.assetgro.stockgro.data.remote.request.UpdatePinNumberRequestDtoV2;
import com.assetgro.stockgro.data.remote.response.AppVersionResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.BaseResponseV2Dto;
import com.assetgro.stockgro.data.remote.response.InviteTemplateResponse;
import com.assetgro.stockgro.data.remote.response.LifetimeEarning;
import com.assetgro.stockgro.data.remote.response.MaintenanceResponse;
import com.assetgro.stockgro.data.remote.response.MaintenanceResponseV2;
import com.assetgro.stockgro.data.remote.response.ServerTimeResponse;
import com.assetgro.stockgro.data.remote.response.SocialConfigResponseDto;
import com.assetgro.stockgro.data.remote.response.UserStatsAndResponseDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.NumberLoginRequestDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.OnboardingResponseDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.PhoneNumberDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.RegisterRequestDto;
import com.assetgro.stockgro.feature_onboarding.data.remote.UserInfoResponseDto;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ij.g;
import ij.h;
import in.juspay.hyper.constants.LogCategory;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kt.d;
import ls.n0;
import nv.v0;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import sh.c;

@Singleton
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\n\b\u0001\u0010¸\u0001\u001a\u00030·\u0001\u0012\b\u0010»\u0001\u001a\u00030º\u0001\u0012\b\u0010¾\u0001\u001a\u00030½\u0001\u0012\b\u0010Á\u0001\u001a\u00030À\u0001\u0012\b\u0010Ä\u0001\u001a\u00030Ã\u0001¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J@\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J^\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000e0\rH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u001f\u0010\u001eJ,\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b!\u0010\"J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000e0\rH\u0086@¢\u0006\u0004\b$\u0010\u001bJ\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u000fJ\u000e\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020#J\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020\u0002JD\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040/J\u0006\u00101\u001a\u00020\u0004J\u0006\u00102\u001a\u00020\u0004J\u000e\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0004J\u000e\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0004J\u0006\u00107\u001a\u00020\u0004J\u0006\u00109\u001a\u000208J\u0006\u0010;\u001a\u00020:J\u0006\u0010<\u001a\u00020:J\u0006\u0010=\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020\u0007J\"\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0A2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0004J\u0012\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u000e0AJ\u0006\u0010E\u001a\u00020\u0004J\u001a\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0A2\u0006\u0010F\u001a\u00020\u0004J\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u000e0A2\u0006\u0010H\u001a\u00020\u0004J$\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u000e0\r2\u0006\u0010H\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bK\u0010LJ*\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0N0\r2\u0006\u0010M\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bQ\u0010LJ*\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0N0\r2\u0006\u0010M\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bR\u0010LJ$\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0O0\r2\u0006\u0010S\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bU\u0010LJ<\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0N0\r2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020WH\u0086@¢\u0006\u0004\b[\u0010\\J\u0018\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0O0\u000e0AJ6\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\u0006\u0010_\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b`\u0010\u001eJ\b\u0010a\u001a\u0004\u0018\u00010\u0004J\u0006\u0010b\u001a\u00020\u0004J\u000e\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0004J,\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0086@¢\u0006\u0004\be\u0010\"J$\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0N0\r2\u0006\u0010f\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bh\u0010LJ*\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0A2\u0006\u0010i\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J&\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m0\u000e0\r2\b\u0010l\u001a\u0004\u0018\u00010kH\u0086@¢\u0006\u0004\bn\u0010oJ\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020p0\rH\u0086@¢\u0006\u0004\bq\u0010\u001bJ\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00010A2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020\u0004J\f\u0010w\u001a\b\u0012\u0004\u0012\u00020v0AJ\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0AJ\u0006\u0010{\u001a\u00020zJ\u000e\u0010}\u001a\u00020\u00072\u0006\u0010|\u001a\u00020zJ\u0006\u0010~\u001a\u00020\u0002J\u0006\u0010\u007f\u001a\u00020\u0002J\u0010\u0010\u0081\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u0002J\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004J\u001b\u0010\u0086\u0001\u001a\r \u0085\u0001*\u0005\u0018\u00010\u0084\u00010\u0084\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0004J\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0089\u0001\u001a\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u0004J\u0014\u0010\u008b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010\u000e0AJ\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004J\u000f\u0010\u008d\u0001\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0004J\u001e\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0A2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0004J\u001d\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0A2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001J'\u0010\u0094\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00010N0\r2\u0006\u0010S\u001a\u00020\u0004H\u0086@¢\u0006\u0005\b\u0094\u0001\u0010LJ\u001f\u0010\u0096\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00010\u000e0\rH\u0086@¢\u0006\u0005\b\u0096\u0001\u0010\u001bJ)\u0010\u0099\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0086@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001e\u0010\u009b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010N0\rH\u0086@¢\u0006\u0005\b\u009b\u0001\u0010\u001bJ\u001f\u0010\u009d\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u00010\u000e0\rH\u0086@¢\u0006\u0005\b\u009d\u0001\u0010\u001bJ\u0019\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010\rH\u0086@¢\u0006\u0005\b\u009f\u0001\u0010\u001bJ@\u0010£\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\r2\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0007\u0010¥\u0001\u001a\u00020\u0007J\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0004J\u0007\u0010§\u0001\u001a\u00020\u0004J\u001f\u0010©\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¨\u00010\u000e0\rH\u0086@¢\u0006\u0005\b©\u0001\u0010\u001bJ(\u0010¬\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00010\u000e0\r2\u0007\u0010ª\u0001\u001a\u00020\u0004H\u0086@¢\u0006\u0005\b¬\u0001\u0010LJ(\u0010¯\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030®\u00010\u000e0\r2\u0007\u0010\u00ad\u0001\u001a\u00020\u0004H\u0086@¢\u0006\u0005\b¯\u0001\u0010LJ\u0007\u0010°\u0001\u001a\u00020\u0002J\t\u0010±\u0001\u001a\u0004\u0018\u00010\u0004J\u001c\u0010³\u0001\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u00042\t\u0010²\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\u0013\u0010¶\u0001\u001a\u00030µ\u00012\u0007\u0010´\u0001\u001a\u00020\u0004H\u0002R\u0018\u0010¸\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Á\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ä\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R)\u0010Ê\u0001\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R)\u0010Ï\u0001\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R)\u0010Ò\u0001\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ç\u0001\"\u0006\bÑ\u0001\u0010É\u0001R)\u0010Õ\u0001\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Ì\u0001\"\u0006\bÔ\u0001\u0010Î\u0001R)\u0010Ø\u0001\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÖ\u0001\u0010Ì\u0001\"\u0006\b×\u0001\u0010Î\u0001R*\u0010Ü\u0001\u001a\u00020\u00042\u0007\u0010Ù\u0001\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÚ\u0001\u0010Ç\u0001\"\u0006\bÛ\u0001\u0010É\u0001R*\u0010ß\u0001\u001a\u00020\u00042\u0007\u0010Ù\u0001\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÝ\u0001\u0010Ç\u0001\"\u0006\bÞ\u0001\u0010É\u0001R\u0016\u0010á\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\b\u001a\u0006\bà\u0001\u0010Ç\u0001¨\u0006ä\u0001"}, d2 = {"Lcom/assetgro/stockgro/data/repository/UserRepository;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "isUserLoggedIn", HttpUrl.FRAGMENT_ENCODE_SET, "getUserReferralCode", "referralCode", HttpUrl.FRAGMENT_ENCODE_SET, "saveUserReferralCode", "phoneNumber", "pin", "osVersion", "countryCode", "Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/feature_onboarding/data/remote/OnboardingResponseDto;", "numberLogin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "mobileNumber", "displayName", "whatsAppConsent", "sessionId", "otp", "register", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/CountriesDto;", "updateAvailableCountriesList", "(Lyt/a;)Ljava/lang/Object;", "otpChannel", "verifyMobile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "resetPasswordOtp", "secret", "verifyOtp", "(Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/feature_onboarding/data/remote/UserInfoResponseDto;", "userInfo", "clearUserData", "data", "saveUserInfo", "saveMessageSeenState", "getMessageSeenState", "updatePinV2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "isSocialHomeFeedEnabled", "socialLandingDestination", "saveSocialConfigToPreferences", "Lkotlin/Pair;", "getSocialConfigFromPreferences", "getUserDisplayName", "getUserAvatar", "newUserName", "setDisplayName", "newUserBio", "setDisplayBio", "getUserDisplayImage", "Lcom/assetgro/stockgro/data/repository/UserDrawerInfo;", "getUserDrawerInfo", "Lat/a;", "logout", "logoutOfflineOnly", "logoutOffline", "checkAndUpdateNewFirebaseToken", "rating", "feedback", "Lat/m;", "submitFeedback", "Lcom/assetgro/stockgro/data/remote/response/AppVersionResponseDto;", "getLatestAppVersion", "getUserPhoneNumber", "contact", "getInviteUserDetails", "profileId", "Lcom/assetgro/stockgro/data/model/ProfileStatsDto;", "getProfileStats", "getProfileStatsV2", "(Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "userID", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseV2Dto;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/FollowerFollowingData;", "getFollowersList", "getFollowingList", "userId", "Lcom/assetgro/stockgro/data/model/socialgroups/SocialGroupsItem;", "getSocialGroupDetails", "trailingDays", HttpUrl.FRAGMENT_ENCODE_SET, "pageLimit", "pageNumber", "Lcom/assetgro/stockgro/data/remote/response/UserStatsAndResponseDto;", "getUserStatsAndRecentPerformance", "(Ljava/lang/String;Ljava/lang/String;IILyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/InvitedFriendDto;", "getInvitedFriends", "invitationCode", "checkInvitationCode", "getCurrentUserId", "getUserImageSignature", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setUserImageSignature", "getPhoneNumberStatus", "pinString", "Lcom/assetgro/stockgro/data/model/AccountDeleteResponse;", "removeUserAccount", "ip", "getUserStatus", "Lcom/assetgro/stockgro/data/model/InviteTemplateDto;", "inviteTemplateDto", "Lcom/assetgro/stockgro/data/remote/response/InviteTemplateResponse;", "getInviteTemplate", "(Lcom/assetgro/stockgro/data/model/InviteTemplateDto;Lyt/a;)Ljava/lang/Object;", "Lcom/assetgro/stockgro/data/model/UserSocialAuthStatusDto;", "getUserSocialAuthStatus", "Lcom/assetgro/stockgro/data/model/SocialDataDto;", "socialDataDto", "platform", "saveUserSocialData", "Lcom/assetgro/stockgro/data/remote/response/MaintenanceResponse;", "getMaintenanceConfig", "Lcom/assetgro/stockgro/data/remote/response/ServerTimeResponse;", "getIndianTimeZoneTime", HttpUrl.FRAGMENT_ENCODE_SET, "getTimeDiff", "diff", "setTimeDiff", "isDeferredDeepLink", "getIsDeepLinkActive", "isActive", "setIsDeepLinkActive", "getDeepLinkPath", "path", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "setDeepLinkPath", "getDeepLinkPathIdentifier", "pathIdentifier", "setDeepLinkPathIdentifier", "Lcom/assetgro/stockgro/data/remote/response/LifetimeEarning;", "myLifetimeEarning", "getInvitationCode", "setInvitationCode", "notificationId", "updateNotificationId", "Lcom/assetgro/stockgro/data/remote/request/AppCloneDataRequest;", "appCloneDataRequest", "postAppCloneData", "Lcom/assetgro/stockgro/data/model/UserBlockStatusDao;", "getUserBlockedStatus", "Lcom/assetgro/stockgro/data/remote/response/SocialConfigResponseDto;", "getSocialConfig", "Lcom/assetgro/stockgro/data/model/homedata/ScrollDepth;", "scrollData", "postScrollDepth", "(Lcom/assetgro/stockgro/data/model/homedata/ScrollDepth;Lyt/a;)Ljava/lang/Object;", "ping", "Lcom/assetgro/stockgro/data/model/VideoTutorialDataResponse;", "getVideoTutorials", "Lcom/assetgro/stockgro/data/remote/response/MaintenanceResponseV2;", "getMaintenanceConfigV2", "Ljava/io/File;", "imageFile", "newBio", "updateUserProfile", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lyt/a;)Ljava/lang/Object;", "initializeLocale", "getCountryCode", "getCountryPrefix", "Lsh/c;", "getUnclaimedScratchCardsForMainDashBoard", "scratchCardId", "Lsh/a;", "claimScratchCardReward", "id", "Lcom/assetgro/stockgro/feature_social/data/remote/ria/RiaProfileResponseDto;", "getRiaProfileData", "isExpertUser", "getUuid", "userPhoneNumber", "saveUserGlobalData", "descriptionString", "Lokhttp3/RequestBody;", "createPartFromString", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/content/Context;", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "networkService", "Lcom/assetgro/stockgro/data/remote/NetworkService;", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "userPreferences", "Lcom/assetgro/stockgro/data/local/preference/UserPreferences;", "Lcom/assetgro/stockgro/data/repository/ChatRepository;", "chatRepository", "Lcom/assetgro/stockgro/data/repository/ChatRepository;", "Lls/n0;", "mixpanelAPI", "Lls/n0;", "getFid", "()Ljava/lang/String;", "setFid", "(Ljava/lang/String;)V", UserPreferences.FID, "getNotificationIdUpdated", "()Z", "setNotificationIdUpdated", "(Z)V", "notificationIdUpdated", "getFirebaseToken", "setFirebaseToken", "firebaseToken", "getCloneDataUpdated", "setCloneDataUpdated", "cloneDataUpdated", "getSubscriptionPlanRegisteredOnMixpanel", "setSubscriptionPlanRegisteredOnMixpanel", "subscriptionPlanRegisteredOnMixpanel", "version", "getPrivacyPolicyVersion", "setPrivacyPolicyVersion", "privacyPolicyVersion", "getTermsAndConditionVersion", "setTermsAndConditionVersion", "termsAndConditionVersion", "getUserToken", "userToken", "<init>", "(Landroid/content/Context;Lcom/assetgro/stockgro/data/remote/NetworkService;Lcom/assetgro/stockgro/data/local/preference/UserPreferences;Lcom/assetgro/stockgro/data/repository/ChatRepository;Lls/n0;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserRepository {
    public static final int $stable = 8;

    @NotNull
    private final ChatRepository chatRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final n0 mixpanelAPI;

    @NotNull
    private final NetworkService networkService;

    @NotNull
    private final UserPreferences userPreferences;

    @Inject
    public UserRepository(@NotNull Context context, @NotNull NetworkService networkService, @NotNull UserPreferences userPreferences, @NotNull ChatRepository chatRepository, @NotNull n0 mixpanelAPI) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(mixpanelAPI, "mixpanelAPI");
        this.context = context;
        this.networkService = networkService;
        this.userPreferences = userPreferences;
        this.chatRepository = chatRepository;
        this.mixpanelAPI = mixpanelAPI;
    }

    private final RequestBody createPartFromString(String descriptionString) {
        return RequestBody.INSTANCE.create(descriptionString, MediaType.INSTANCE.parse("multipart/form-data"));
    }

    public static final boolean logout$lambda$10(Function1 function1, Object obj) {
        return ((Boolean) a3.a.c(function1, "$tmp0", obj, "p0", obj)).booleanValue();
    }

    public static final void logout$lambda$9(UserRepository this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userPreferences.clearPreferences();
    }

    public static final void logoutOfflineOnly$lambda$11(UserRepository this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserPreferences.setAccessToken$default(this$0.userPreferences, null, false, 2, null);
        this$0.userPreferences.clearPreferences();
    }

    public static /* synthetic */ Object numberLogin$default(UserRepository userRepository, String str, String str2, String str3, String str4, yt.a aVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = "IN";
        }
        return userRepository.numberLogin(str, str2, str3, str4, aVar);
    }

    public static /* synthetic */ Object resetPasswordOtp$default(UserRepository userRepository, String str, String str2, String str3, yt.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "IN";
        }
        if ((i10 & 4) != 0) {
            str3 = "sms";
        }
        return userRepository.resetPasswordOtp(str, str2, str3, aVar);
    }

    private final void saveUserGlobalData(String userId, String userPhoneNumber) {
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication");
        GlobalUserPreferences globalUserPreferences = ((StockGroApplication) applicationContext).f8561b;
        if (globalUserPreferences != null) {
            globalUserPreferences.setUuid(userId);
            if (userPhoneNumber != null) {
                globalUserPreferences.setPhoneNumber(userPhoneNumber);
            }
            globalUserPreferences.setExistingUser(true);
            return;
        }
        Intrinsics.k("globalUserPreferences");
        throw null;
    }

    public static /* synthetic */ Object verifyMobile$default(UserRepository userRepository, String str, String str2, String str3, yt.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "IN";
        }
        if ((i10 & 4) != 0) {
            str3 = "sms";
        }
        return userRepository.verifyMobile(str, str2, str3, aVar);
    }

    public final void checkAndUpdateNewFirebaseToken() {
        if (this.userPreferences.getNewFirebaseToken().length() > 0) {
            this.networkService.updateFirebaseToken(this.userPreferences.getNewFirebaseToken());
            this.userPreferences.setNewFirebaseToken(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public final Object checkInvitationCode(@NotNull String str, String str2, @NotNull String str3, @NotNull yt.a<? super v0<BaseResponseDto<Object>>> aVar) {
        NetworkService networkService = this.networkService;
        String c10 = this.mixpanelAPI.f25265g.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getDistinctId(...)");
        return networkService.checkInvitationCode(str, c10, str2, str3, aVar);
    }

    public final Object claimScratchCardReward(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<sh.a>>> aVar) {
        NetworkService networkService = this.networkService;
        String uuid = this.userPreferences.getUuid();
        if (uuid == null) {
            uuid = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return networkService.claimScratchCardReward(uuid, str, aVar);
    }

    public final void clearUserData() {
        this.userPreferences.clearPreferences();
    }

    public final boolean getCloneDataUpdated() {
        return this.userPreferences.getCloneDataUpdated();
    }

    public final String getCountryCode() {
        return this.userPreferences.getCountryCode();
    }

    @NotNull
    public final String getCountryPrefix() {
        return this.userPreferences.getMobilePrefix();
    }

    public final String getCurrentUserId() {
        return this.userPreferences.getUuid();
    }

    public final String getDeepLinkPath() {
        return this.userPreferences.getDeepLinkPath();
    }

    public final String getDeepLinkPathIdentifier() {
        return this.userPreferences.getDeepLinkPathIdentifier();
    }

    @NotNull
    public final String getFid() {
        String fid = this.userPreferences.getFid();
        if (fid == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return fid;
    }

    @NotNull
    public final String getFirebaseToken() {
        return this.userPreferences.getFirebaseToken();
    }

    public final Object getFollowersList(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<List<FollowerFollowingData>>>> aVar) {
        return this.networkService.getFollowersDetails(str, aVar);
    }

    public final Object getFollowingList(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<List<FollowerFollowingData>>>> aVar) {
        return this.networkService.getFollowingDetails(str, aVar);
    }

    @NotNull
    public final m<ServerTimeResponse> getIndianTimeZoneTime() {
        return this.networkService.getIndianTimeZoneTime();
    }

    public final String getInvitationCode() {
        return this.userPreferences.getInvitationCode();
    }

    public final Object getInviteTemplate(InviteTemplateDto inviteTemplateDto, @NotNull yt.a<? super v0<BaseResponseDto<InviteTemplateResponse>>> aVar) {
        return this.networkService.getTemplateFromGooglyService(inviteTemplateDto, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<String>> getInviteUserDetails(@NotNull String contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return this.networkService.getInviteUserDetails(contact);
    }

    @NotNull
    public final m<BaseResponseDto<List<InvitedFriendDto>>> getInvitedFriends() {
        return this.networkService.getInvitedFriends();
    }

    public final boolean getIsDeepLinkActive() {
        return this.userPreferences.isDeepLinkActive();
    }

    @NotNull
    public final m<BaseResponseDto<AppVersionResponseDto>> getLatestAppVersion() {
        return this.networkService.getLatestAppVersion();
    }

    @NotNull
    public final m<MaintenanceResponse> getMaintenanceConfig() {
        return this.networkService.getMaintenanceConfig();
    }

    public final Object getMaintenanceConfigV2(@NotNull yt.a<? super v0<MaintenanceResponseV2>> aVar) {
        String str;
        NetworkService networkService = this.networkService;
        byte[] bArr = kj.a.f23206a;
        if (kj.a.f23207b) {
            str = "status_prod-AE.json";
        } else {
            str = "status_prod.json";
        }
        return networkService.getMaintenanceConfigV2(str, aVar);
    }

    public final boolean getMessageSeenState() {
        return this.userPreferences.getHasVisitedHomePage();
    }

    public final boolean getNotificationIdUpdated() {
        return this.userPreferences.getNotificationIdUpdated();
    }

    public final Object getPhoneNumberStatus(@NotNull String str, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseDto<Object>>> aVar) {
        NetworkService networkService = this.networkService;
        String c10 = this.mixpanelAPI.f25265g.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getDistinctId(...)");
        return networkService.getPhoneNumberStatus(str, c10, str2, aVar);
    }

    @NotNull
    public final String getPrivacyPolicyVersion() {
        return String.valueOf(this.userPreferences.getPrivacyPolicyVersion());
    }

    @NotNull
    public final m<BaseResponseDto<ProfileStatsDto>> getProfileStats(@NotNull String profileId) {
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        return this.networkService.getProfileStats(profileId);
    }

    public final Object getProfileStatsV2(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<ProfileStatsDto>>> aVar) {
        return this.networkService.getProfileStatsV2(str, aVar);
    }

    public final Object getRiaProfileData(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseDto<RiaProfileResponseDto>>> aVar) {
        return this.networkService.getRiaProfileData(str, aVar);
    }

    public final Object getSocialConfig(@NotNull yt.a<? super v0<BaseResponseDto<SocialConfigResponseDto>>> aVar) {
        return this.networkService.getSocialConfig(aVar);
    }

    @NotNull
    public final Pair<Boolean, String> getSocialConfigFromPreferences() {
        UserPreferences userPreferences = this.userPreferences;
        boolean isSocialHomeFeedEnabled = userPreferences.isSocialHomeFeedEnabled();
        return new Pair<>(Boolean.valueOf(isSocialHomeFeedEnabled), userPreferences.getSocialLanding());
    }

    public final Object getSocialGroupDetails(@NotNull String str, @NotNull yt.a<? super v0<List<SocialGroupsItem>>> aVar) {
        return this.networkService.getSocialGroupsDetails(str, aVar);
    }

    public final boolean getSubscriptionPlanRegisteredOnMixpanel() {
        return this.userPreferences.getSubscriptionPlanRegisteredOnMixpanel();
    }

    @NotNull
    public final String getTermsAndConditionVersion() {
        return String.valueOf(this.userPreferences.getTermsAndConditionVersion());
    }

    public final long getTimeDiff() {
        return this.userPreferences.getTimeDiff();
    }

    public final Object getUnclaimedScratchCardsForMainDashBoard(@NotNull yt.a<? super v0<BaseResponseDto<c>>> aVar) {
        NetworkService networkService = this.networkService;
        String uuid = this.userPreferences.getUuid();
        if (uuid == null) {
            uuid = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return networkService.getUnclaimedScratchCardsForMainDashBoard(uuid, aVar);
    }

    @NotNull
    public final String getUserAvatar() {
        return this.userPreferences.getAvatarUrl();
    }

    public final Object getUserBlockedStatus(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<UserBlockStatusDao>>> aVar) {
        return this.networkService.getUserBlockedStatus(str, aVar);
    }

    @NotNull
    public final String getUserDisplayImage() {
        return this.userPreferences.getAvatarUrl();
    }

    @NotNull
    public final String getUserDisplayName() {
        return this.userPreferences.getUserDisplayName();
    }

    @NotNull
    public final UserDrawerInfo getUserDrawerInfo() {
        return new UserDrawerInfo(this.userPreferences.getUserDisplayName(), getUserAvatar());
    }

    @NotNull
    public final String getUserImageSignature() {
        return this.userPreferences.getUserImageSignature();
    }

    @NotNull
    public final String getUserPhoneNumber() {
        String phoneNumber = this.userPreferences.getPhoneNumber();
        if (phoneNumber == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return phoneNumber;
    }

    public final String getUserReferralCode() {
        return this.userPreferences.getUserReferralCode();
    }

    public final Object getUserSocialAuthStatus(@NotNull yt.a<? super v0<UserSocialAuthStatusDto>> aVar) {
        return this.networkService.getUserSocialAuthStatus(this.userPreferences.getUuid(), aVar);
    }

    public final Object getUserStatsAndRecentPerformance(@NotNull String str, @NotNull String str2, int i10, int i11, @NotNull yt.a<? super v0<BaseResponseV2Dto<UserStatsAndResponseDto>>> aVar) {
        return this.networkService.getUserStatsAndRecentPerformance(str, str2, i10, i11, aVar);
    }

    @NotNull
    public final m<BaseResponseDto<Object>> getUserStatus(@NotNull String ip2, @NotNull String phoneNumber, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return this.networkService.getUserStatus(new GeoDto(ip2, phoneNumber, this.userPreferences.getFid(), this.userPreferences.getFirebaseToken(), countryCode));
    }

    public final String getUserToken() {
        return this.userPreferences.getAccessToken();
    }

    public final String getUuid() {
        return this.userPreferences.getUuid();
    }

    public final Object getVideoTutorials(@NotNull yt.a<? super v0<BaseResponseDto<VideoTutorialDataResponse>>> aVar) {
        return this.networkService.getVideoTutorials(aVar);
    }

    public final void initializeLocale() {
        this.userPreferences.initializeLocale();
        h hVar = h.f20067a;
        h.i();
    }

    public final boolean isDeferredDeepLink() {
        return this.userPreferences.isDeferredDeepLink();
    }

    public final boolean isExpertUser() {
        return this.userPreferences.isExpertUser();
    }

    public final boolean isUserLoggedIn() {
        return !TextUtils.isEmpty(this.userPreferences.getAccessToken());
    }

    @NotNull
    public final at.a logout() {
        m<BaseResponseDto<Object>> logout = this.networkService.logout();
        logout.getClass();
        kt.c cVar = new kt.c(new kt.c(new d(logout, 1), new d(new a(this, 1), 0), 0), new com.assetgro.stockgro.data.a(5, UserRepository$logout$2.INSTANCE), 1);
        Intrinsics.checkNotNullExpressionValue(cVar, "onErrorComplete(...)");
        return cVar;
    }

    public final void logoutOffline() {
        qv.a.a(new Object[0]);
        this.userPreferences.setAccessToken(null, true);
        this.userPreferences.clearPreferences();
    }

    @NotNull
    public final at.a logoutOfflineOnly() {
        qv.a.a(new Object[0]);
        d dVar = new d(new a(this, 0), 0);
        Intrinsics.checkNotNullExpressionValue(dVar, "fromAction(...)");
        return dVar;
    }

    @NotNull
    public final m<BaseResponseDto<LifetimeEarning>> myLifetimeEarning() {
        return this.networkService.lifetimeEarning(this.userPreferences.getUuid());
    }

    public final Object numberLogin(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull yt.a<? super v0<BaseResponseDto<OnboardingResponseDto>>> aVar) {
        return this.networkService.numberLogin(new NumberLoginRequestDto(str, str2, this.userPreferences.getFirebaseToken(), "220", this.userPreferences.getFirebaseToken(), this.userPreferences.getFid(), str3, str4), aVar);
    }

    public final Object ping(@NotNull yt.a<? super v0<BaseResponseV2Dto<Object>>> aVar) {
        return this.networkService.ping(aVar);
    }

    @NotNull
    public final m<BaseResponseDto<Object>> postAppCloneData(@NotNull AppCloneDataRequest appCloneDataRequest) {
        Intrinsics.checkNotNullParameter(appCloneDataRequest, "appCloneDataRequest");
        return this.networkService.postAppData(this.userPreferences.getUuid(), appCloneDataRequest);
    }

    public final Object postScrollDepth(@NotNull ScrollDepth scrollDepth, @NotNull yt.a<? super v0<BaseResponseDto<Object>>> aVar) {
        return this.networkService.postScrollDepth(scrollDepth, aVar);
    }

    public final Object register(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, boolean z10, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull yt.a<? super v0<BaseResponseDto<OnboardingResponseDto>>> aVar) {
        NetworkService networkService = this.networkService;
        RegisterRequestDto registerRequestDto = new RegisterRequestDto(str, str2, this.userPreferences.getFirebaseToken(), str3, str4, "220", z10, str5, str6, this.userPreferences.getFirebaseToken(), this.userPreferences.getFid(), str7);
        String c10 = this.mixpanelAPI.f25265g.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getDistinctId(...)");
        return networkService.register(registerRequestDto, c10, aVar);
    }

    public final Object removeUserAccount(@NotNull String str, @NotNull yt.a<? super v0<BaseResponseV2Dto<AccountDeleteResponse>>> aVar) {
        return this.networkService.removeUserAccount(new AccountDeleteRequest(str, String.valueOf(this.userPreferences.getUuid())), aVar);
    }

    public final Object resetPasswordOtp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull yt.a<? super v0<BaseResponseDto<String>>> aVar) {
        return this.networkService.resetPasswordOtp(new PhoneNumberDto(g.a(str), str2, str3), aVar);
    }

    public final void saveMessageSeenState() {
        this.userPreferences.setHasVisitedHomePage(true);
    }

    public final void saveSocialConfigToPreferences(boolean isSocialHomeFeedEnabled, String socialLandingDestination) {
        UserPreferences userPreferences = this.userPreferences;
        userPreferences.setIsSocialHomeFeedEnabled(isSocialHomeFeedEnabled);
        if (socialLandingDestination != null) {
            userPreferences.setSocialLanding(socialLandingDestination);
        }
    }

    public final void saveUserInfo(@NotNull OnboardingResponseDto data) {
        Intrinsics.checkNotNullParameter(data, "data");
        UserPreferences userPreferences = this.userPreferences;
        userPreferences.setAccessToken(data.getAccessToken(), true);
        UserPreferences.setRefreshToken$default(userPreferences, data.getRefreshToken(), false, 2, null);
        userPreferences.setUserDisplayName(data.getDisplayName());
        String avatar = data.getAvatar();
        if (avatar != null) {
            userPreferences.setAvatarUrl(avatar);
        }
        userPreferences.setLoginId(data.getLoginId());
        String userRole = data.getUserRole();
        if (userRole != null) {
            UserPreferences.setUserRole$default(userPreferences, userRole, false, 2, null);
        }
    }

    public final void saveUserReferralCode(@NotNull String referralCode) {
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        this.userPreferences.setUserReferralCode(referralCode, true);
    }

    @NotNull
    public final m<Object> saveUserSocialData(@NotNull SocialDataDto socialDataDto, @NotNull String platform) {
        Intrinsics.checkNotNullParameter(socialDataDto, "socialDataDto");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return this.networkService.saveUserSocialData(platform, socialDataDto);
    }

    public final void setCloneDataUpdated(boolean z10) {
        this.userPreferences.setCloneDataUpdated(z10);
    }

    public final SharedPreferences.Editor setDeepLinkPath(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return this.userPreferences.setDeepLinkPath(path, true);
    }

    public final void setDeepLinkPathIdentifier(@NotNull String pathIdentifier) {
        Intrinsics.checkNotNullParameter(pathIdentifier, "pathIdentifier");
        this.userPreferences.setDeepLinkPathIdentifier(pathIdentifier);
    }

    public final void setDisplayBio(@NotNull String newUserBio) {
        Intrinsics.checkNotNullParameter(newUserBio, "newUserBio");
        this.userPreferences.setUserDisplayBio(newUserBio);
    }

    public final void setDisplayName(@NotNull String newUserName) {
        Intrinsics.checkNotNullParameter(newUserName, "newUserName");
        this.userPreferences.setUserDisplayName(newUserName);
    }

    public final void setFid(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.userPreferences.setFid(value);
    }

    public final void setFirebaseToken(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.userPreferences.setFirebaseToken(value);
    }

    public final void setInvitationCode(@NotNull String invitationCode) {
        Intrinsics.checkNotNullParameter(invitationCode, "invitationCode");
        this.userPreferences.setInvitationCode(invitationCode);
    }

    public final void setIsDeepLinkActive(boolean isActive) {
        this.userPreferences.setIsDeepLinkActive(isActive);
    }

    public final void setNotificationIdUpdated(boolean z10) {
        this.userPreferences.setNotificationIdUpdated(z10);
    }

    public final void setPrivacyPolicyVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.userPreferences.setPrivacyPolicyVersion(version);
    }

    public final void setSubscriptionPlanRegisteredOnMixpanel(boolean z10) {
        this.userPreferences.setSubscriptionPlanRegisteredOnMixpanel(z10);
    }

    public final void setTermsAndConditionVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.userPreferences.setTermsAndConditionVersion(version);
    }

    public final void setTimeDiff(long diff) {
        this.userPreferences.setTimeDiff(diff);
    }

    public final void setUserImageSignature(@NotNull String r22) {
        Intrinsics.checkNotNullParameter(r22, "value");
        this.userPreferences.setUserImageSignature(r22);
    }

    @NotNull
    public final m<BaseResponseDto<Object>> submitFeedback(@NotNull String rating, @NotNull String feedback) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        return this.networkService.submitFeedback(new FeedbackRequestDto(rating, feedback));
    }

    public final Object updateAvailableCountriesList(@NotNull yt.a<? super v0<BaseResponseDto<CountriesDto>>> aVar) {
        return this.networkService.updateAvailableCountriesList(aVar);
    }

    @NotNull
    public final m<BaseResponseDto<String>> updateNotificationId(String notificationId) {
        return this.networkService.updateNotificationId(new NotificationIdUpdateDto(notificationId));
    }

    public final Object updatePinV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull yt.a<? super v0<BaseResponseDto<Object>>> aVar) {
        return this.networkService.updatePinV2(new UpdatePinNumberRequestDtoV2(str2, str, str3, str4, str5), aVar);
    }

    public final Object updateUserProfile(File file, String str, String str2, @NotNull yt.a<? super v0<BaseResponseDto<Unit>>> aVar) {
        MultipartBody.Part part;
        RequestBody requestBody;
        RequestBody requestBody2 = null;
        if (file != null) {
            part = MultipartBody.Part.INSTANCE.createFormData("image", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("multipart/form-data")));
        } else {
            part = null;
        }
        if (str != null) {
            requestBody = createPartFromString(str);
        } else {
            requestBody = null;
        }
        if (str2 != null) {
            requestBody2 = createPartFromString(str2);
        }
        RequestBody requestBody3 = requestBody2;
        NetworkService networkService = this.networkService;
        String uuid = this.userPreferences.getUuid();
        if (uuid == null) {
            uuid = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return networkService.updateUserProfile(part, requestBody, requestBody3, uuid, aVar);
    }

    public final Object userInfo(@NotNull yt.a<? super v0<BaseResponseDto<UserInfoResponseDto>>> aVar) {
        return this.networkService.userInfo(aVar);
    }

    public final Object verifyMobile(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull yt.a<? super v0<BaseResponseDto<String>>> aVar) {
        NetworkService networkService = this.networkService;
        PhoneNumberDto phoneNumberDto = new PhoneNumberDto(g.a(str), str2, str3);
        String c10 = this.mixpanelAPI.f25265g.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getDistinctId(...)");
        return networkService.verifyMobile(phoneNumberDto, c10, aVar);
    }

    public final Object verifyOtp(@NotNull String str, @NotNull String str2, @NotNull yt.a<? super v0<BaseResponseDto<String>>> aVar) {
        NetworkService networkService = this.networkService;
        String c10 = this.mixpanelAPI.f25265g.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getDistinctId(...)");
        return networkService.verifyOtp(str, str2, c10, aVar);
    }

    public final void saveUserInfo(@NotNull UserInfoResponseDto data) {
        Intrinsics.checkNotNullParameter(data, "data");
        UserPreferences userPreferences = this.userPreferences;
        userPreferences.setUuid(data.getUuid());
        userPreferences.setPhoneNumber(data.getPhoneNumber());
        String avatarUrl = data.getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        userPreferences.setAvatarUrl(avatarUrl);
        userPreferences.setUserDisplayName(data.getName());
        userPreferences.setCountryCode(data.getCountryCode());
        userPreferences.setMobilePrefix(data.getMobilePrefix());
        userPreferences.setExpertUser(data.isExpert());
        saveUserGlobalData(data.getUuid(), data.getPhoneNumber());
    }
}
