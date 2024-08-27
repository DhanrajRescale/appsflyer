package com.assetgro.stockgro.data.model.arenaV2;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.enums.LeagueStatus;
import com.assetgro.stockgro.data.model.PrizeDistributionDto;
import com.assetgro.stockgro.data.model.portfolio.holdings.Portfolio;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import da.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\b\u0082\u0001\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\u0006\u0010$\u001a\u00020\u0013\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010*\u001a\u00020+\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0013\u0012\b\u00100\u001a\u0004\u0018\u00010\u001c\u0012\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u000203\u0018\u000102j\n\u0012\u0004\u0012\u000203\u0018\u0001`4\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u00010\u0013\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010?¢\u0006\u0002\u0010@J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\nHÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010nJ\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010nJ\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\n\u0010\u009c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0013HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020+HÆ\u0003J\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0002\u0010BJ\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010ª\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010cJ\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010cJ\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010nJ\u001e\u0010®\u0001\u001a\u0016\u0012\u0004\u0012\u000203\u0018\u000102j\n\u0012\u0004\u0012\u000203\u0018\u0001`4HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000107HÆ\u0003J\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010cJ\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\nHÆ\u0003J\n\u0010º\u0001\u001a\u00020\nHÆ\u0003J\n\u0010»\u0001\u001a\u00020\nHÆ\u0003J\u0012\u0010¼\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0003\u0010\u0080\u0001Jæ\u0004\u0010½\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001c2\u001c\b\u0002\u00101\u001a\u0016\u0012\u0004\u0012\u000203\u0018\u000102j\n\u0012\u0004\u0012\u000203\u0018\u0001`42\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?HÆ\u0001¢\u0006\u0003\u0010¾\u0001J\n\u0010¿\u0001\u001a\u00020\nHÖ\u0001J\u0016\u0010À\u0001\u001a\u00020\u00132\n\u0010Á\u0001\u001a\u0005\u0018\u00010Â\u0001HÖ\u0003J\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003J\b\u0010Ä\u0001\u001a\u00030Å\u0001J\n\u0010Æ\u0001\u001a\u00020\nHÖ\u0001J\n\u0010Ç\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010È\u0001\u001a\u00030É\u00012\b\u0010Ê\u0001\u001a\u00030Ë\u00012\u0007\u0010Ì\u0001\u001a\u00020\nHÖ\u0001R\u001a\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0016\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0018\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0018\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010GR\u0018\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010GR\u0018\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010GR\u0018\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010GR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010GR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001a\u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bT\u0010PR\u0016\u0010$\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001a\u0010'\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bW\u0010PR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010GR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010GR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010[R\u0018\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010GR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010[R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010GR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010d\u001a\u0004\bb\u0010cR\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010[R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010GR \u0010>\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u00108\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010d\u001a\u0004\bk\u0010cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010GR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010o\u001a\u0004\bm\u0010nR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bp\u0010PR\"\u0010/\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\bq\u0010c\"\u0004\br\u0010sR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010o\u001a\u0004\bt\u0010nR*\u00101\u001a\u0016\u0012\u0004\u0012\u000203\u0018\u000102j\n\u0012\u0004\u0012\u000203\u0018\u0001`48\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0016\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010[R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010d\u001a\u0004\bx\u0010cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010GR\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010GR\u0016\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010[R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\b|\u0010PR\u0016\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010SR\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010GR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0003\u0010\u0081\u0001\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010 \u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010SR\u0017\u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010SR\u0017\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010GR\u001b\u0010.\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010d\u001a\u0005\b\u0085\u0001\u0010cR\u001b\u00100\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010o\u001a\u0005\b\u0086\u0001\u0010nR\u0017\u0010#\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010VR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010Q\u001a\u0005\b\u0088\u0001\u0010PR\u001b\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010Q\u001a\u0005\b\u0089\u0001\u0010P¨\u0006Í\u0001"}, d2 = {"Lcom/assetgro/stockgro/data/model/arenaV2/ArenaGame;", "Landroid/os/Parcelable;", "assetClass", HttpUrl.FRAGMENT_ENCODE_SET, "displayPic", "endTime", HttpUrl.FRAGMENT_ENCODE_SET, "frequency", "gameId", "joiningFee", HttpUrl.FRAGMENT_ENCODE_SET, "maximumPlayers", "minimumPlayers", "totalParticipants", AppMeasurementSdk.ConditionalUserProperty.NAME, "packageType", "paymentModel", "prizePool", "promoted", HttpUrl.FRAGMENT_ENCODE_SET, "orderPlaced", "promotionCopy", "seatsLeft", "startTime", "startDate", "endDate", "portfolioSubmissionTime", "portfolioValue", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioPercent", "portfolioId", "winnerAnnounce", "tradeEnd", "tradeStart", "type", "winCash", "fillingFast", "winnerTime", "exitTime", "forfeitTime", "status", "rank", "amountWon", HttpUrl.FRAGMENT_ENCODE_SET, "amountLeft", "message", "userAlreadyJoined", "portfolioSubmitted", "walletBalance", "priceModel", "Ljava/util/ArrayList;", "Lcom/assetgro/stockgro/data/model/PrizeDistributionDto;", "Lkotlin/collections/ArrayList;", "balance", "leagueRules", HttpUrl.FRAGMENT_ENCODE_SET, "portfolioAvailable", "deposit", "breakdownCash", "breakdownNote", "breakdownDeposit", "cash", "portfolio", "Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;IJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;JJLjava/lang/String;ZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;)V", "getAmountLeft", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAmountWon", "()D", "getAssetClass", "()Ljava/lang/String;", "getBalance", "getBreakdownCash", "getBreakdownDeposit", "getBreakdownNote", "getCash", "getDeposit", "getDisplayPic", "getEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "()J", "getExitTime", "getFillingFast", "()Z", "getForfeitTime", "getFrequency", "getGameId", "getJoiningFee", "()I", "getLeagueRules", "()Ljava/util/List;", "getMaximumPlayers", "getMessage", "getMinimumPlayers", "getName", "getOrderPlaced", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPackageType", "getPaymentModel", "getPortfolio", "()Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;", "setPortfolio", "(Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;)V", "getPortfolioAvailable", "getPortfolioId", "getPortfolioPercent", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPortfolioSubmissionTime", "getPortfolioSubmitted", "setPortfolioSubmitted", "(Ljava/lang/Boolean;)V", "getPortfolioValue", "getPriceModel", "()Ljava/util/ArrayList;", "getPrizePool", "getPromoted", "getPromotionCopy", "getRank", "getSeatsLeft", "getStartDate", "getStartTime", "getStatus", "getTotalParticipants", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTradeEnd", "getTradeStart", "getType", "getUserAlreadyJoined", "getWalletBalance", "getWinCash", "getWinnerAnnounce", "getWinnerTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;IJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Long;JJLjava/lang/String;ZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/portfolio/holdings/Portfolio;)Lcom/assetgro/stockgro/data/model/arenaV2/ArenaGame;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "getDerivedPortfolioId", "getLeagueStatus", "Lcom/assetgro/stockgro/data/enums/LeagueStatus;", "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ArenaGame implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ArenaGame> CREATOR = new Creator();

    @SerializedName("amount_left")
    private final Double amountLeft;

    @SerializedName("amount_won")
    private final double amountWon;

    @SerializedName("asset_class")
    @NotNull
    private final String assetClass;

    @SerializedName("balance")
    private final String balance;

    @SerializedName("breakdown_cash")
    private final String breakdownCash;

    @SerializedName("breakdown_deposit")
    private final String breakdownDeposit;

    @SerializedName("breakdown_note")
    private final String breakdownNote;

    @SerializedName("cash")
    private final String cash;

    @SerializedName("deposit")
    private final String deposit;

    @SerializedName(alternate = {"league_display_pic"}, value = "display_pic")
    private final String displayPic;

    @SerializedName("end_date")
    private final Long endDate;

    @SerializedName("end_time")
    private final long endTime;

    @SerializedName("exit_time")
    private final Long exitTime;

    @SerializedName("filling_fast")
    private final boolean fillingFast;

    @SerializedName("forfeit_time")
    private final Long forfeitTime;

    @SerializedName("frequency")
    @NotNull
    private final String frequency;

    @SerializedName(alternate = {"league_id"}, value = "game_id")
    @NotNull
    private final String gameId;

    @SerializedName("joining_fee")
    private final int joiningFee;

    @SerializedName("rules")
    private final List<String> leagueRules;

    @SerializedName("maximum_players")
    private final int maximumPlayers;

    @SerializedName("message")
    private final String message;

    @SerializedName("minimum_players")
    private final int minimumPlayers;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("order_placed")
    private final Boolean orderPlaced;

    @SerializedName("package_type")
    private final int packageType;

    @SerializedName("payment_model")
    @NotNull
    private final String paymentModel;

    @SerializedName("portfolio")
    private Portfolio portfolio;

    @SerializedName("portfolio_available")
    private final Boolean portfolioAvailable;

    @SerializedName("portfolio_id")
    private final String portfolioId;

    @SerializedName("portfolio_percent")
    private final Float portfolioPercent;

    @SerializedName("portfolio_submission_time")
    private final Long portfolioSubmissionTime;

    @SerializedName("portfolio_submitted")
    private Boolean portfolioSubmitted;

    @SerializedName("portfolio_value")
    private final Float portfolioValue;

    @SerializedName("price_model")
    private final ArrayList<PrizeDistributionDto> priceModel;

    @SerializedName(alternate = {"total_price_money"}, value = "prize_pool")
    private final int prizePool;

    @SerializedName("promoted")
    private final Boolean promoted;

    @SerializedName("promotion_copy")
    private final String promotionCopy;

    @SerializedName("rank")
    private final String rank;

    @SerializedName("seats_left")
    private final int seatsLeft;

    @SerializedName("start_date")
    private final Long startDate;

    @SerializedName("start_time")
    private final long startTime;

    @SerializedName("status")
    private final String status;

    @SerializedName("total_participants")
    private final Integer totalParticipants;

    @SerializedName("trade_end")
    private final long tradeEnd;

    @SerializedName("trade_start")
    private final long tradeStart;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("user_already_joined")
    private final Boolean userAlreadyJoined;

    @SerializedName("wallet_balance")
    private final Float walletBalance;

    @SerializedName("win_cash")
    private final boolean winCash;

    @SerializedName("winner_announce")
    private final Long winnerAnnounce;

    @SerializedName("winner_time")
    private final Long winnerTime;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ArenaGame> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ArenaGame createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean bool;
            ArrayList arrayList;
            String str;
            int i10;
            Boolean valueOf5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            int readInt4 = parcel.readInt();
            String readString6 = parcel.readString();
            int readInt5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString7 = parcel.readString();
            int readInt6 = parcel.readInt();
            long readLong2 = parcel.readLong();
            Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf8 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf9 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Float valueOf10 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf11 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString8 = parcel.readString();
            Long valueOf12 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            String readString9 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            Long valueOf13 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf14 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf15 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            double readDouble = parcel.readDouble();
            Double valueOf16 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Float valueOf17 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                bool = valueOf;
                i10 = readInt4;
                str = readString6;
                arrayList = null;
            } else {
                int readInt7 = parcel.readInt();
                bool = valueOf;
                arrayList = new ArrayList(readInt7);
                str = readString6;
                int i11 = 0;
                while (i11 != readInt7) {
                    i11 = h.e(PrizeDistributionDto.CREATOR, parcel, arrayList, i11, 1);
                    readInt7 = readInt7;
                    readInt4 = readInt4;
                }
                i10 = readInt4;
            }
            String readString13 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ArenaGame(readString, readString2, readLong, readString3, readString4, readInt, readInt2, readInt3, valueOf6, readString5, i10, str, readInt5, bool, valueOf2, readString7, readInt6, readLong2, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, readString8, valueOf12, readLong3, readLong4, readString9, z10, z11, valueOf13, valueOf14, valueOf15, readString10, readString11, readDouble, valueOf16, readString12, valueOf3, valueOf4, valueOf17, arrayList, readString13, createStringArrayList, valueOf5, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Portfolio.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ArenaGame[] newArray(int i10) {
            return new ArenaGame[i10];
        }
    }

    public ArenaGame(@NotNull String assetClass, String str, long j10, @NotNull String frequency, @NotNull String gameId, int i10, int i11, int i12, Integer num, @NotNull String name, int i13, @NotNull String paymentModel, int i14, Boolean bool, Boolean bool2, String str2, int i15, long j11, Long l10, Long l11, Long l12, Float f10, Float f11, String str3, Long l13, long j12, long j13, @NotNull String type, boolean z10, boolean z11, Long l14, Long l15, Long l16, String str4, String str5, double d10, Double d11, String str6, Boolean bool3, Boolean bool4, Float f12, ArrayList<PrizeDistributionDto> arrayList, String str7, List<String> list, Boolean bool5, String str8, String str9, String str10, String str11, String str12, Portfolio portfolio) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paymentModel, "paymentModel");
        Intrinsics.checkNotNullParameter(type, "type");
        this.assetClass = assetClass;
        this.displayPic = str;
        this.endTime = j10;
        this.frequency = frequency;
        this.gameId = gameId;
        this.joiningFee = i10;
        this.maximumPlayers = i11;
        this.minimumPlayers = i12;
        this.totalParticipants = num;
        this.name = name;
        this.packageType = i13;
        this.paymentModel = paymentModel;
        this.prizePool = i14;
        this.promoted = bool;
        this.orderPlaced = bool2;
        this.promotionCopy = str2;
        this.seatsLeft = i15;
        this.startTime = j11;
        this.startDate = l10;
        this.endDate = l11;
        this.portfolioSubmissionTime = l12;
        this.portfolioValue = f10;
        this.portfolioPercent = f11;
        this.portfolioId = str3;
        this.winnerAnnounce = l13;
        this.tradeEnd = j12;
        this.tradeStart = j13;
        this.type = type;
        this.winCash = z10;
        this.fillingFast = z11;
        this.winnerTime = l14;
        this.exitTime = l15;
        this.forfeitTime = l16;
        this.status = str4;
        this.rank = str5;
        this.amountWon = d10;
        this.amountLeft = d11;
        this.message = str6;
        this.userAlreadyJoined = bool3;
        this.portfolioSubmitted = bool4;
        this.walletBalance = f12;
        this.priceModel = arrayList;
        this.balance = str7;
        this.leagueRules = list;
        this.portfolioAvailable = bool5;
        this.deposit = str8;
        this.breakdownCash = str9;
        this.breakdownNote = str10;
        this.breakdownDeposit = str11;
        this.cash = str12;
        this.portfolio = portfolio;
    }

    public static /* synthetic */ ArenaGame copy$default(ArenaGame arenaGame, String str, String str2, long j10, String str3, String str4, int i10, int i11, int i12, Integer num, String str5, int i13, String str6, int i14, Boolean bool, Boolean bool2, String str7, int i15, long j11, Long l10, Long l11, Long l12, Float f10, Float f11, String str8, Long l13, long j12, long j13, String str9, boolean z10, boolean z11, Long l14, Long l15, Long l16, String str10, String str11, double d10, Double d11, String str12, Boolean bool3, Boolean bool4, Float f12, ArrayList arrayList, String str13, List list, Boolean bool5, String str14, String str15, String str16, String str17, String str18, Portfolio portfolio, int i16, int i17, Object obj) {
        String str19 = (i16 & 1) != 0 ? arenaGame.assetClass : str;
        String str20 = (i16 & 2) != 0 ? arenaGame.displayPic : str2;
        long j14 = (i16 & 4) != 0 ? arenaGame.endTime : j10;
        String str21 = (i16 & 8) != 0 ? arenaGame.frequency : str3;
        String str22 = (i16 & 16) != 0 ? arenaGame.gameId : str4;
        int i18 = (i16 & 32) != 0 ? arenaGame.joiningFee : i10;
        int i19 = (i16 & 64) != 0 ? arenaGame.maximumPlayers : i11;
        int i20 = (i16 & 128) != 0 ? arenaGame.minimumPlayers : i12;
        Integer num2 = (i16 & 256) != 0 ? arenaGame.totalParticipants : num;
        String str23 = (i16 & 512) != 0 ? arenaGame.name : str5;
        int i21 = (i16 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? arenaGame.packageType : i13;
        String str24 = (i16 & 2048) != 0 ? arenaGame.paymentModel : str6;
        int i22 = (i16 & 4096) != 0 ? arenaGame.prizePool : i14;
        Boolean bool6 = (i16 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? arenaGame.promoted : bool;
        Boolean bool7 = (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? arenaGame.orderPlaced : bool2;
        String str25 = (i16 & 32768) != 0 ? arenaGame.promotionCopy : str7;
        int i23 = i21;
        int i24 = (i16 & 65536) != 0 ? arenaGame.seatsLeft : i15;
        long j15 = (i16 & 131072) != 0 ? arenaGame.startTime : j11;
        Long l17 = (i16 & 262144) != 0 ? arenaGame.startDate : l10;
        return arenaGame.copy(str19, str20, j14, str21, str22, i18, i19, i20, num2, str23, i23, str24, i22, bool6, bool7, str25, i24, j15, l17, (524288 & i16) != 0 ? arenaGame.endDate : l11, (i16 & 1048576) != 0 ? arenaGame.portfolioSubmissionTime : l12, (i16 & 2097152) != 0 ? arenaGame.portfolioValue : f10, (i16 & 4194304) != 0 ? arenaGame.portfolioPercent : f11, (i16 & 8388608) != 0 ? arenaGame.portfolioId : str8, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? arenaGame.winnerAnnounce : l13, (i16 & 33554432) != 0 ? arenaGame.tradeEnd : j12, (i16 & 67108864) != 0 ? arenaGame.tradeStart : j13, (i16 & 134217728) != 0 ? arenaGame.type : str9, (268435456 & i16) != 0 ? arenaGame.winCash : z10, (i16 & 536870912) != 0 ? arenaGame.fillingFast : z11, (i16 & 1073741824) != 0 ? arenaGame.winnerTime : l14, (i16 & Integer.MIN_VALUE) != 0 ? arenaGame.exitTime : l15, (i17 & 1) != 0 ? arenaGame.forfeitTime : l16, (i17 & 2) != 0 ? arenaGame.status : str10, (i17 & 4) != 0 ? arenaGame.rank : str11, (i17 & 8) != 0 ? arenaGame.amountWon : d10, (i17 & 16) != 0 ? arenaGame.amountLeft : d11, (i17 & 32) != 0 ? arenaGame.message : str12, (i17 & 64) != 0 ? arenaGame.userAlreadyJoined : bool3, (i17 & 128) != 0 ? arenaGame.portfolioSubmitted : bool4, (i17 & 256) != 0 ? arenaGame.walletBalance : f12, (i17 & 512) != 0 ? arenaGame.priceModel : arrayList, (i17 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? arenaGame.balance : str13, (i17 & 2048) != 0 ? arenaGame.leagueRules : list, (i17 & 4096) != 0 ? arenaGame.portfolioAvailable : bool5, (i17 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? arenaGame.deposit : str14, (i17 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? arenaGame.breakdownCash : str15, (i17 & 32768) != 0 ? arenaGame.breakdownNote : str16, (i17 & 65536) != 0 ? arenaGame.breakdownDeposit : str17, (i17 & 131072) != 0 ? arenaGame.cash : str18, (i17 & 262144) != 0 ? arenaGame.portfolio : portfolio);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAssetClass() {
        return this.assetClass;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component11, reason: from getter */
    public final int getPackageType() {
        return this.packageType;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getPaymentModel() {
        return this.paymentModel;
    }

    /* renamed from: component13, reason: from getter */
    public final int getPrizePool() {
        return this.prizePool;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getPromoted() {
        return this.promoted;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getOrderPlaced() {
        return this.orderPlaced;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPromotionCopy() {
        return this.promotionCopy;
    }

    /* renamed from: component17, reason: from getter */
    public final int getSeatsLeft() {
        return this.seatsLeft;
    }

    /* renamed from: component18, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component19, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayPic() {
        return this.displayPic;
    }

    /* renamed from: component20, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* renamed from: component21, reason: from getter */
    public final Long getPortfolioSubmissionTime() {
        return this.portfolioSubmissionTime;
    }

    /* renamed from: component22, reason: from getter */
    public final Float getPortfolioValue() {
        return this.portfolioValue;
    }

    /* renamed from: component23, reason: from getter */
    public final Float getPortfolioPercent() {
        return this.portfolioPercent;
    }

    /* renamed from: component24, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* renamed from: component25, reason: from getter */
    public final Long getWinnerAnnounce() {
        return this.winnerAnnounce;
    }

    /* renamed from: component26, reason: from getter */
    public final long getTradeEnd() {
        return this.tradeEnd;
    }

    /* renamed from: component27, reason: from getter */
    public final long getTradeStart() {
        return this.tradeStart;
    }

    @NotNull
    /* renamed from: component28, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getWinCash() {
        return this.winCash;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getFillingFast() {
        return this.fillingFast;
    }

    /* renamed from: component31, reason: from getter */
    public final Long getWinnerTime() {
        return this.winnerTime;
    }

    /* renamed from: component32, reason: from getter */
    public final Long getExitTime() {
        return this.exitTime;
    }

    /* renamed from: component33, reason: from getter */
    public final Long getForfeitTime() {
        return this.forfeitTime;
    }

    /* renamed from: component34, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component35, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    /* renamed from: component36, reason: from getter */
    public final double getAmountWon() {
        return this.amountWon;
    }

    /* renamed from: component37, reason: from getter */
    public final Double getAmountLeft() {
        return this.amountLeft;
    }

    /* renamed from: component38, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component39, reason: from getter */
    public final Boolean getUserAlreadyJoined() {
        return this.userAlreadyJoined;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* renamed from: component40, reason: from getter */
    public final Boolean getPortfolioSubmitted() {
        return this.portfolioSubmitted;
    }

    /* renamed from: component41, reason: from getter */
    public final Float getWalletBalance() {
        return this.walletBalance;
    }

    public final ArrayList<PrizeDistributionDto> component42() {
        return this.priceModel;
    }

    /* renamed from: component43, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    public final List<String> component44() {
        return this.leagueRules;
    }

    /* renamed from: component45, reason: from getter */
    public final Boolean getPortfolioAvailable() {
        return this.portfolioAvailable;
    }

    /* renamed from: component46, reason: from getter */
    public final String getDeposit() {
        return this.deposit;
    }

    /* renamed from: component47, reason: from getter */
    public final String getBreakdownCash() {
        return this.breakdownCash;
    }

    /* renamed from: component48, reason: from getter */
    public final String getBreakdownNote() {
        return this.breakdownNote;
    }

    /* renamed from: component49, reason: from getter */
    public final String getBreakdownDeposit() {
        return this.breakdownDeposit;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* renamed from: component50, reason: from getter */
    public final String getCash() {
        return this.cash;
    }

    /* renamed from: component51, reason: from getter */
    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    /* renamed from: component6, reason: from getter */
    public final int getJoiningFee() {
        return this.joiningFee;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaximumPlayers() {
        return this.maximumPlayers;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMinimumPlayers() {
        return this.minimumPlayers;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getTotalParticipants() {
        return this.totalParticipants;
    }

    @NotNull
    public final ArenaGame copy(@NotNull String assetClass, String displayPic, long endTime, @NotNull String frequency, @NotNull String gameId, int joiningFee, int maximumPlayers, int minimumPlayers, Integer totalParticipants, @NotNull String name, int packageType, @NotNull String paymentModel, int prizePool, Boolean promoted, Boolean orderPlaced, String promotionCopy, int seatsLeft, long startTime, Long startDate, Long endDate, Long portfolioSubmissionTime, Float portfolioValue, Float portfolioPercent, String portfolioId, Long winnerAnnounce, long tradeEnd, long tradeStart, @NotNull String type, boolean winCash, boolean fillingFast, Long winnerTime, Long exitTime, Long forfeitTime, String status, String rank, double amountWon, Double amountLeft, String message, Boolean userAlreadyJoined, Boolean portfolioSubmitted, Float walletBalance, ArrayList<PrizeDistributionDto> priceModel, String balance, List<String> leagueRules, Boolean portfolioAvailable, String deposit, String breakdownCash, String breakdownNote, String breakdownDeposit, String cash, Portfolio portfolio) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(paymentModel, "paymentModel");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ArenaGame(assetClass, displayPic, endTime, frequency, gameId, joiningFee, maximumPlayers, minimumPlayers, totalParticipants, name, packageType, paymentModel, prizePool, promoted, orderPlaced, promotionCopy, seatsLeft, startTime, startDate, endDate, portfolioSubmissionTime, portfolioValue, portfolioPercent, portfolioId, winnerAnnounce, tradeEnd, tradeStart, type, winCash, fillingFast, winnerTime, exitTime, forfeitTime, status, rank, amountWon, amountLeft, message, userAlreadyJoined, portfolioSubmitted, walletBalance, priceModel, balance, leagueRules, portfolioAvailable, deposit, breakdownCash, breakdownNote, breakdownDeposit, cash, portfolio);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArenaGame)) {
            return false;
        }
        ArenaGame arenaGame = (ArenaGame) other;
        return Intrinsics.a(this.assetClass, arenaGame.assetClass) && Intrinsics.a(this.displayPic, arenaGame.displayPic) && this.endTime == arenaGame.endTime && Intrinsics.a(this.frequency, arenaGame.frequency) && Intrinsics.a(this.gameId, arenaGame.gameId) && this.joiningFee == arenaGame.joiningFee && this.maximumPlayers == arenaGame.maximumPlayers && this.minimumPlayers == arenaGame.minimumPlayers && Intrinsics.a(this.totalParticipants, arenaGame.totalParticipants) && Intrinsics.a(this.name, arenaGame.name) && this.packageType == arenaGame.packageType && Intrinsics.a(this.paymentModel, arenaGame.paymentModel) && this.prizePool == arenaGame.prizePool && Intrinsics.a(this.promoted, arenaGame.promoted) && Intrinsics.a(this.orderPlaced, arenaGame.orderPlaced) && Intrinsics.a(this.promotionCopy, arenaGame.promotionCopy) && this.seatsLeft == arenaGame.seatsLeft && this.startTime == arenaGame.startTime && Intrinsics.a(this.startDate, arenaGame.startDate) && Intrinsics.a(this.endDate, arenaGame.endDate) && Intrinsics.a(this.portfolioSubmissionTime, arenaGame.portfolioSubmissionTime) && Intrinsics.a(this.portfolioValue, arenaGame.portfolioValue) && Intrinsics.a(this.portfolioPercent, arenaGame.portfolioPercent) && Intrinsics.a(this.portfolioId, arenaGame.portfolioId) && Intrinsics.a(this.winnerAnnounce, arenaGame.winnerAnnounce) && this.tradeEnd == arenaGame.tradeEnd && this.tradeStart == arenaGame.tradeStart && Intrinsics.a(this.type, arenaGame.type) && this.winCash == arenaGame.winCash && this.fillingFast == arenaGame.fillingFast && Intrinsics.a(this.winnerTime, arenaGame.winnerTime) && Intrinsics.a(this.exitTime, arenaGame.exitTime) && Intrinsics.a(this.forfeitTime, arenaGame.forfeitTime) && Intrinsics.a(this.status, arenaGame.status) && Intrinsics.a(this.rank, arenaGame.rank) && Double.compare(this.amountWon, arenaGame.amountWon) == 0 && Intrinsics.a(this.amountLeft, arenaGame.amountLeft) && Intrinsics.a(this.message, arenaGame.message) && Intrinsics.a(this.userAlreadyJoined, arenaGame.userAlreadyJoined) && Intrinsics.a(this.portfolioSubmitted, arenaGame.portfolioSubmitted) && Intrinsics.a(this.walletBalance, arenaGame.walletBalance) && Intrinsics.a(this.priceModel, arenaGame.priceModel) && Intrinsics.a(this.balance, arenaGame.balance) && Intrinsics.a(this.leagueRules, arenaGame.leagueRules) && Intrinsics.a(this.portfolioAvailable, arenaGame.portfolioAvailable) && Intrinsics.a(this.deposit, arenaGame.deposit) && Intrinsics.a(this.breakdownCash, arenaGame.breakdownCash) && Intrinsics.a(this.breakdownNote, arenaGame.breakdownNote) && Intrinsics.a(this.breakdownDeposit, arenaGame.breakdownDeposit) && Intrinsics.a(this.cash, arenaGame.cash) && Intrinsics.a(this.portfolio, arenaGame.portfolio);
    }

    public final Double getAmountLeft() {
        return this.amountLeft;
    }

    public final double getAmountWon() {
        return this.amountWon;
    }

    @NotNull
    public final String getAssetClass() {
        return this.assetClass;
    }

    public final String getBalance() {
        return this.balance;
    }

    public final String getBreakdownCash() {
        return this.breakdownCash;
    }

    public final String getBreakdownDeposit() {
        return this.breakdownDeposit;
    }

    public final String getBreakdownNote() {
        return this.breakdownNote;
    }

    public final String getCash() {
        return this.cash;
    }

    public final String getDeposit() {
        return this.deposit;
    }

    public final String getDerivedPortfolioId() {
        String portfolioId;
        Portfolio portfolio = this.portfolio;
        if (portfolio == null) {
            return this.portfolioId;
        }
        if (portfolio == null || (portfolioId = portfolio.getPortfolioId()) == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return portfolioId;
    }

    public final String getDisplayPic() {
        return this.displayPic;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final Long getExitTime() {
        return this.exitTime;
    }

    public final boolean getFillingFast() {
        return this.fillingFast;
    }

    public final Long getForfeitTime() {
        return this.forfeitTime;
    }

    @NotNull
    public final String getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    public final int getJoiningFee() {
        return this.joiningFee;
    }

    public final List<String> getLeagueRules() {
        return this.leagueRules;
    }

    @NotNull
    public final LeagueStatus getLeagueStatus() {
        long j10;
        long currentTimeMillis = System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        if (Intrinsics.a(this.status, "FL")) {
            return LeagueStatus.LEAGUE_CANCELLED;
        }
        long j11 = this.startTime;
        if (currentTimeMillis < j11) {
            return LeagueStatus.LEAGUE_NOT_STARTED;
        }
        long j12 = this.tradeStart;
        if (currentTimeMillis < j12 && j11 <= currentTimeMillis) {
            return LeagueStatus.LEAGUE_TRADING_NOT_STARTED;
        }
        long j13 = this.tradeEnd;
        if (currentTimeMillis < j13 && j12 <= currentTimeMillis) {
            return LeagueStatus.LEAGUE_TRADING_STARTED;
        }
        Long l10 = this.winnerTime;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        if (currentTimeMillis < j10 && j13 <= currentTimeMillis) {
            return LeagueStatus.LEAGUE_WINNER_NOT_DECLARED;
        }
        return LeagueStatus.LEAGUE_WINNER_DECLARED;
    }

    public final int getMaximumPlayers() {
        return this.maximumPlayers;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getMinimumPlayers() {
        return this.minimumPlayers;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Boolean getOrderPlaced() {
        return this.orderPlaced;
    }

    public final int getPackageType() {
        return this.packageType;
    }

    @NotNull
    public final String getPaymentModel() {
        return this.paymentModel;
    }

    public final Portfolio getPortfolio() {
        return this.portfolio;
    }

    public final Boolean getPortfolioAvailable() {
        return this.portfolioAvailable;
    }

    public final String getPortfolioId() {
        return this.portfolioId;
    }

    public final Float getPortfolioPercent() {
        return this.portfolioPercent;
    }

    public final Long getPortfolioSubmissionTime() {
        return this.portfolioSubmissionTime;
    }

    public final Boolean getPortfolioSubmitted() {
        return this.portfolioSubmitted;
    }

    public final Float getPortfolioValue() {
        return this.portfolioValue;
    }

    public final ArrayList<PrizeDistributionDto> getPriceModel() {
        return this.priceModel;
    }

    public final int getPrizePool() {
        return this.prizePool;
    }

    public final Boolean getPromoted() {
        return this.promoted;
    }

    public final String getPromotionCopy() {
        return this.promotionCopy;
    }

    public final String getRank() {
        return this.rank;
    }

    public final int getSeatsLeft() {
        return this.seatsLeft;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getTotalParticipants() {
        return this.totalParticipants;
    }

    public final long getTradeEnd() {
        return this.tradeEnd;
    }

    public final long getTradeStart() {
        return this.tradeStart;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final Boolean getUserAlreadyJoined() {
        return this.userAlreadyJoined;
    }

    public final Float getWalletBalance() {
        return this.walletBalance;
    }

    public final boolean getWinCash() {
        return this.winCash;
    }

    public final Long getWinnerAnnounce() {
        return this.winnerAnnounce;
    }

    public final Long getWinnerTime() {
        return this.winnerTime;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32 = this.assetClass.hashCode() * 31;
        String str = this.displayPic;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = e.f(this.minimumPlayers, e.f(this.maximumPlayers, e.f(this.joiningFee, h.g(this.gameId, h.g(this.frequency, v.e.c(this.endTime, (hashCode32 + hashCode) * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.totalParticipants;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int f11 = e.f(this.prizePool, h.g(this.paymentModel, e.f(this.packageType, h.g(this.name, (f10 + hashCode2) * 31, 31), 31), 31), 31);
        Boolean bool = this.promoted;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (f11 + hashCode3) * 31;
        Boolean bool2 = this.orderPlaced;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str2 = this.promotionCopy;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int c10 = v.e.c(this.startTime, e.f(this.seatsLeft, (i12 + hashCode5) * 31, 31), 31);
        Long l10 = this.startDate;
        if (l10 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l10.hashCode();
        }
        int i13 = (c10 + hashCode6) * 31;
        Long l11 = this.endDate;
        if (l11 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l11.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Long l12 = this.portfolioSubmissionTime;
        if (l12 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l12.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        Float f12 = this.portfolioValue;
        if (f12 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = f12.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        Float f13 = this.portfolioPercent;
        if (f13 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = f13.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        String str3 = this.portfolioId;
        if (str3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str3.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        Long l13 = this.winnerAnnounce;
        if (l13 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l13.hashCode();
        }
        int d10 = v.e.d(this.fillingFast, v.e.d(this.winCash, h.g(this.type, v.e.c(this.tradeStart, v.e.c(this.tradeEnd, (i18 + hashCode12) * 31, 31), 31), 31), 31), 31);
        Long l14 = this.winnerTime;
        if (l14 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l14.hashCode();
        }
        int i19 = (d10 + hashCode13) * 31;
        Long l15 = this.exitTime;
        if (l15 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l15.hashCode();
        }
        int i20 = (i19 + hashCode14) * 31;
        Long l16 = this.forfeitTime;
        if (l16 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l16.hashCode();
        }
        int i21 = (i20 + hashCode15) * 31;
        String str4 = this.status;
        if (str4 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str4.hashCode();
        }
        int i22 = (i21 + hashCode16) * 31;
        String str5 = this.rank;
        if (str5 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str5.hashCode();
        }
        int c11 = d.c(this.amountWon, (i22 + hashCode17) * 31, 31);
        Double d11 = this.amountLeft;
        if (d11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = d11.hashCode();
        }
        int i23 = (c11 + hashCode18) * 31;
        String str6 = this.message;
        if (str6 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str6.hashCode();
        }
        int i24 = (i23 + hashCode19) * 31;
        Boolean bool3 = this.userAlreadyJoined;
        if (bool3 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = bool3.hashCode();
        }
        int i25 = (i24 + hashCode20) * 31;
        Boolean bool4 = this.portfolioSubmitted;
        if (bool4 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = bool4.hashCode();
        }
        int i26 = (i25 + hashCode21) * 31;
        Float f14 = this.walletBalance;
        if (f14 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = f14.hashCode();
        }
        int i27 = (i26 + hashCode22) * 31;
        ArrayList<PrizeDistributionDto> arrayList = this.priceModel;
        if (arrayList == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = arrayList.hashCode();
        }
        int i28 = (i27 + hashCode23) * 31;
        String str7 = this.balance;
        if (str7 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str7.hashCode();
        }
        int i29 = (i28 + hashCode24) * 31;
        List<String> list = this.leagueRules;
        if (list == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = list.hashCode();
        }
        int i30 = (i29 + hashCode25) * 31;
        Boolean bool5 = this.portfolioAvailable;
        if (bool5 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = bool5.hashCode();
        }
        int i31 = (i30 + hashCode26) * 31;
        String str8 = this.deposit;
        if (str8 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str8.hashCode();
        }
        int i32 = (i31 + hashCode27) * 31;
        String str9 = this.breakdownCash;
        if (str9 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str9.hashCode();
        }
        int i33 = (i32 + hashCode28) * 31;
        String str10 = this.breakdownNote;
        if (str10 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str10.hashCode();
        }
        int i34 = (i33 + hashCode29) * 31;
        String str11 = this.breakdownDeposit;
        if (str11 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str11.hashCode();
        }
        int i35 = (i34 + hashCode30) * 31;
        String str12 = this.cash;
        if (str12 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str12.hashCode();
        }
        int i36 = (i35 + hashCode31) * 31;
        Portfolio portfolio = this.portfolio;
        if (portfolio != null) {
            i10 = portfolio.hashCode();
        }
        return i36 + i10;
    }

    public final void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public final void setPortfolioSubmitted(Boolean bool) {
        this.portfolioSubmitted = bool;
    }

    @NotNull
    public String toString() {
        String str = this.assetClass;
        String str2 = this.displayPic;
        long j10 = this.endTime;
        String str3 = this.frequency;
        String str4 = this.gameId;
        int i10 = this.joiningFee;
        int i11 = this.maximumPlayers;
        int i12 = this.minimumPlayers;
        Integer num = this.totalParticipants;
        String str5 = this.name;
        int i13 = this.packageType;
        String str6 = this.paymentModel;
        int i14 = this.prizePool;
        Boolean bool = this.promoted;
        Boolean bool2 = this.orderPlaced;
        String str7 = this.promotionCopy;
        int i15 = this.seatsLeft;
        long j11 = this.startTime;
        Long l10 = this.startDate;
        Long l11 = this.endDate;
        Long l12 = this.portfolioSubmissionTime;
        Float f10 = this.portfolioValue;
        Float f11 = this.portfolioPercent;
        String str8 = this.portfolioId;
        Long l13 = this.winnerAnnounce;
        long j12 = this.tradeEnd;
        long j13 = this.tradeStart;
        String str9 = this.type;
        boolean z10 = this.winCash;
        boolean z11 = this.fillingFast;
        Long l14 = this.winnerTime;
        Long l15 = this.exitTime;
        Long l16 = this.forfeitTime;
        String str10 = this.status;
        String str11 = this.rank;
        double d10 = this.amountWon;
        Double d11 = this.amountLeft;
        String str12 = this.message;
        Boolean bool3 = this.userAlreadyJoined;
        Boolean bool4 = this.portfolioSubmitted;
        Float f12 = this.walletBalance;
        ArrayList<PrizeDistributionDto> arrayList = this.priceModel;
        String str13 = this.balance;
        List<String> list = this.leagueRules;
        Boolean bool5 = this.portfolioAvailable;
        String str14 = this.deposit;
        String str15 = this.breakdownCash;
        String str16 = this.breakdownNote;
        String str17 = this.breakdownDeposit;
        String str18 = this.cash;
        Portfolio portfolio = this.portfolio;
        StringBuilder l17 = v.e.l("ArenaGame(assetClass=", str, ", displayPic=", str2, ", endTime=");
        l17.append(j10);
        l17.append(", frequency=");
        l17.append(str3);
        l17.append(", gameId=");
        l17.append(str4);
        l17.append(", joiningFee=");
        l17.append(i10);
        l17.append(", maximumPlayers=");
        l17.append(i11);
        l17.append(", minimumPlayers=");
        l17.append(i12);
        l17.append(", totalParticipants=");
        l17.append(num);
        l17.append(", name=");
        l17.append(str5);
        l17.append(", packageType=");
        l17.append(i13);
        l17.append(", paymentModel=");
        l17.append(str6);
        l17.append(", prizePool=");
        l17.append(i14);
        l17.append(", promoted=");
        l17.append(bool);
        l17.append(", orderPlaced=");
        l17.append(bool2);
        l17.append(", promotionCopy=");
        l17.append(str7);
        l17.append(", seatsLeft=");
        l17.append(i15);
        l17.append(", startTime=");
        l17.append(j11);
        l17.append(", startDate=");
        l17.append(l10);
        l17.append(", endDate=");
        l17.append(l11);
        l17.append(", portfolioSubmissionTime=");
        l17.append(l12);
        l17.append(", portfolioValue=");
        l17.append(f10);
        l17.append(", portfolioPercent=");
        l17.append(f11);
        l17.append(", portfolioId=");
        l17.append(str8);
        l17.append(", winnerAnnounce=");
        l17.append(l13);
        l17.append(", tradeEnd=");
        l17.append(j12);
        l17.append(", tradeStart=");
        l17.append(j13);
        l17.append(", type=");
        l17.append(str9);
        l17.append(", winCash=");
        l17.append(z10);
        l17.append(", fillingFast=");
        l17.append(z11);
        l17.append(", winnerTime=");
        l17.append(l14);
        l17.append(", exitTime=");
        l17.append(l15);
        l17.append(", forfeitTime=");
        l17.append(l16);
        l17.append(", status=");
        l17.append(str10);
        l17.append(", rank=");
        l17.append(str11);
        l17.append(", amountWon=");
        l17.append(d10);
        l17.append(", amountLeft=");
        l17.append(d11);
        l17.append(", message=");
        l17.append(str12);
        l17.append(", userAlreadyJoined=");
        l17.append(bool3);
        l17.append(", portfolioSubmitted=");
        l17.append(bool4);
        l17.append(", walletBalance=");
        l17.append(f12);
        l17.append(", priceModel=");
        l17.append(arrayList);
        l17.append(", balance=");
        l17.append(str13);
        l17.append(", leagueRules=");
        l17.append(list);
        l17.append(", portfolioAvailable=");
        l17.append(bool5);
        v.e.v(l17, ", deposit=", str14, ", breakdownCash=", str15);
        v.e.v(l17, ", breakdownNote=", str16, ", breakdownDeposit=", str17);
        l17.append(", cash=");
        l17.append(str18);
        l17.append(", portfolio=");
        l17.append(portfolio);
        l17.append(")");
        return l17.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.assetClass);
        parcel.writeString(this.displayPic);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.frequency);
        parcel.writeString(this.gameId);
        parcel.writeInt(this.joiningFee);
        parcel.writeInt(this.maximumPlayers);
        parcel.writeInt(this.minimumPlayers);
        Integer num = this.totalParticipants;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.name);
        parcel.writeInt(this.packageType);
        parcel.writeString(this.paymentModel);
        parcel.writeInt(this.prizePool);
        Boolean bool = this.promoted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool);
        }
        Boolean bool2 = this.orderPlaced;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool2);
        }
        parcel.writeString(this.promotionCopy);
        parcel.writeInt(this.seatsLeft);
        parcel.writeLong(this.startTime);
        Long l10 = this.startDate;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l10);
        }
        Long l11 = this.endDate;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l11);
        }
        Long l12 = this.portfolioSubmissionTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l12);
        }
        Float f10 = this.portfolioValue;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        Float f11 = this.portfolioPercent;
        if (f11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f11.floatValue());
        }
        parcel.writeString(this.portfolioId);
        Long l13 = this.winnerAnnounce;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l13);
        }
        parcel.writeLong(this.tradeEnd);
        parcel.writeLong(this.tradeStart);
        parcel.writeString(this.type);
        parcel.writeInt(this.winCash ? 1 : 0);
        parcel.writeInt(this.fillingFast ? 1 : 0);
        Long l14 = this.winnerTime;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l14);
        }
        Long l15 = this.exitTime;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l15);
        }
        Long l16 = this.forfeitTime;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l16);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.rank);
        parcel.writeDouble(this.amountWon);
        Double d10 = this.amountLeft;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        parcel.writeString(this.message);
        Boolean bool3 = this.userAlreadyJoined;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool3);
        }
        Boolean bool4 = this.portfolioSubmitted;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool4);
        }
        Float f12 = this.walletBalance;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f12.floatValue());
        }
        ArrayList<PrizeDistributionDto> arrayList = this.priceModel;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<PrizeDistributionDto> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.balance);
        parcel.writeStringList(this.leagueRules);
        Boolean bool5 = this.portfolioAvailable;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            a.q(parcel, 1, bool5);
        }
        parcel.writeString(this.deposit);
        parcel.writeString(this.breakdownCash);
        parcel.writeString(this.breakdownNote);
        parcel.writeString(this.breakdownDeposit);
        parcel.writeString(this.cash);
        Portfolio portfolio = this.portfolio;
        if (portfolio == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            portfolio.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ArenaGame(String str, String str2, long j10, String str3, String str4, int i10, int i11, int i12, Integer num, String str5, int i13, String str6, int i14, Boolean bool, Boolean bool2, String str7, int i15, long j11, Long l10, Long l11, Long l12, Float f10, Float f11, String str8, Long l13, long j12, long j13, String str9, boolean z10, boolean z11, Long l14, Long l15, Long l16, String str10, String str11, double d10, Double d11, String str12, Boolean bool3, Boolean bool4, Float f12, ArrayList arrayList, String str13, List list, Boolean bool5, String str14, String str15, String str16, String str17, String str18, Portfolio portfolio, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, i10, i11, i12, (i16 & 256) != 0 ? 0 : num, str5, i13, str6, i14, bool, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Boolean.FALSE : bool2, str7, i15, j11, l10, l11, l12, f10, f11, str8, l13, j12, j13, str9, z10, z11, l14, l15, l16, str10, str11, d10, d11, str12, bool3, bool4, f12, arrayList, str13, list, bool5, str14, str15, str16, str17, str18, portfolio);
    }
}
