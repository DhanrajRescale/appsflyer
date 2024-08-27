package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import ek.e;
import ek.h;
import h.m0;
import i5.w;
import il.b;
import in.juspay.hyper.constants.LogCategory;
import j5.d;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.c;
import nl.d0;
import nl.t;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sl.a;
import vt.u0;
import xk.g0;
import xk.n0;
import xk.s;
import xk.v;
import xk.z;
import yk.l;
import yk.o;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002^!B\u000b\b\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0016\u001a\u00020\u000bH\u0007J\b\u0010\u0017\u001a\u00020\u0012H\u0007J\b\u0010\u0018\u001a\u00020\u0012H\u0007J\b\u0010\u0019\u001a\u00020\u0012H\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0012H\u0007J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007J\"\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J\u001a\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007J\b\u0010#\u001a\u00020\u000bH\u0007J\b\u0010$\u001a\u00020\u0005H\u0007J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0007J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020&H\u0007J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010(\u001a\u00020&H\u0007J\b\u0010+\u001a\u00020\u0005H\u0007J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020&H\u0007J\b\u0010-\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0012H\u0007J\b\u0010/\u001a\u00020\u001cH\u0007J\u0018\u00102\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0012H\u0007J\u0018\u00103\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0012H\u0003J\b\u00104\u001a\u00020\u0012H\u0007J\u0010\u00105\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001cH\u0007J\u0018\u00107\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u000bH\u0007J\u0019\u0010:\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\b8\u00109J\u0014\u0010;\u001a\u0004\u0018\u00010\u00122\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u0010<\u001a\u00020\u0012H\u0007J\u0010\u0010=\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0012H\u0007J\n\u0010>\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010@\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010A\u001a\u00020\u0012H\u0007J\u0012\u0010C\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010D\u001a\u00020\u000bH\u0007J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0007J\b\u0010G\u001a\u00020\u000bH\u0007J\u0010\u0010H\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0007J\b\u0010I\u001a\u00020\u000bH\u0007J\b\u0010J\u001a\u00020\u000bH\u0007J\b\u0010K\u001a\u00020\u000bH\u0007J\u0010\u0010L\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0007J\u0010\u0010M\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0007J\b\u0010N\u001a\u00020\u000bH\u0007J\u0010\u0010O\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u000bH\u0007J\u001f\u0010R\u001a\u00020\u00052\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010PH\u0007¢\u0006\u0004\bR\u0010SJ/\u0010R\u001a\u00020\u00052\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010P2\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u001eH\u0007¢\u0006\u0004\bR\u0010VJ\n\u0010X\u001a\u0004\u0018\u00010WH\u0007J\u0010\u0010Z\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020WH\u0007J\b\u0010[\u001a\u00020\u001eH\u0007J\u0010\u0010]\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u001eH\u0007J\u0017\u0010b\u001a\u00020\u00052\u0006\u0010_\u001a\u00020^H\u0001¢\u0006\u0004\b`\u0010aR\u001c\u0010d\u001a\n c*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010h\u001a\u0012\u0012\u0004\u0012\u00020&0fj\b\u0012\u0004\u0012\u00020&`g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010lR\u0018\u00101\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010eR\u0018\u0010?\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010eR\u0018\u0010m\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010eR\u0018\u0010n\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010tR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020W0u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010vR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010wR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010kR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010eR\u0014\u0010{\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010kR\u0014\u0010|\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010eR\u0014\u0010}\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010eR\u0014\u0010~\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010eR\u0014\u0010\u007f\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010eR\u0016\u0010\u0080\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010eR\u0016\u0010\u0081\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010eR\u0016\u0010\u0082\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010eR\u0016\u0010\u0083\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010eR\u0016\u0010\u0084\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010eR\u0016\u0010\u0085\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010eR\u0016\u0010\u0086\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010eR\u0016\u0010\u0087\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010eR\u0016\u0010\u0088\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010eR\u0016\u0010\u0089\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010eR\u0016\u0010\u008a\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010eR\u0016\u0010\u008b\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010eR\u0016\u0010\u008c\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010eR\u0016\u0010\u008d\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010eR\u0016\u0010\u008e\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010eR\u0018\u0010\u008f\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010tR\u0018\u0010\u0090\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010tR\u0018\u0010\u0091\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010tR\u0016\u0010\u0092\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010eR\u0016\u0010\u0093\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010eR\u0016\u0010\u0094\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010eR\u0016\u0010\u0095\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010eR\u0016\u0010\u0096\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010eR\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010eR\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010eR\u0017\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010\u009b\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010eR\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010t¨\u0006\u009f\u0001"}, d2 = {"Lcom/facebook/FacebookSdk;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/concurrent/Executor;", "getExecutor", "executor", HttpUrl.FRAGMENT_ENCODE_SET, "setExecutor", HttpUrl.FRAGMENT_ENCODE_SET, "getOnProgressThreshold", "threshold", "setOnProgressThreshold", HttpUrl.FRAGMENT_ENCODE_SET, "isDebugEnabled", "enabled", "setIsDebugEnabled", "isLegacyTokenUpgradeSupported", "supported", "setLegacyTokenUpgradeSupported", HttpUrl.FRAGMENT_ENCODE_SET, "getGraphApiVersion", "graphApiVersion", "setGraphApiVersion", "isFullyInitialized", "getFacebookDomain", "getFacebookGamingDomain", "getInstagramDomain", "facebookDomain", "setFacebookDomain", "Landroid/content/Context;", "applicationContext", HttpUrl.FRAGMENT_ENCODE_SET, "callbackRequestCodeOffset", "sdkInitialize", "Lxk/t;", "callback", "isInitialized", "fullyInitialize", HttpUrl.FRAGMENT_ENCODE_SET, "Lxk/g0;", "getLoggingBehaviors", "behavior", "addLoggingBehavior", "removeLoggingBehavior", "clearLoggingBehaviors", "isLoggingBehaviorEnabled", "updateGraphDebugBehavior", "getGraphDomain", "getApplicationContext", LogCategory.CONTEXT, "applicationId", "publishInstallAsync", "publishInstallAndWaitForResponse", "getSdkVersion", "getLimitEventAndDataUsage", "limitEventUsage", "setLimitEventAndDataUsage", "loadDefaultsFromMetadata$facebook_core_release", "(Landroid/content/Context;)V", "loadDefaultsFromMetadata", "getApplicationSignature", "getApplicationId", "setApplicationId", "getApplicationName", "applicationName", "setApplicationName", "getClientToken", "clientToken", "setClientToken", "getAutoInitEnabled", "flag", "setAutoInitEnabled", "getAutoLogAppEventsEnabled", "setAutoLogAppEventsEnabled", "getCodelessDebugLogEnabled", "getCodelessSetupEnabled", "getAdvertiserIDCollectionEnabled", "setAdvertiserIDCollectionEnabled", "setCodelessDebugLogEnabled", "getMonitorEnabled", "setMonitorEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "options", "setDataProcessingOptions", "([Ljava/lang/String;)V", "country", "state", "([Ljava/lang/String;II)V", "Ljava/io/File;", "getCacheDir", "cacheDir", "setCacheDir", "getCallbackRequestCodeOffset", "requestCode", "isFacebookRequestCode", "Lxk/s;", "graphRequestCreator", "setGraphRequestCreator$facebook_core_release", "(Lxk/s;)V", "setGraphRequestCreator", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "loggingBehaviors", "Ljava/util/HashSet;", "DEFAULT_CALLBACK_REQUEST_CODE_OFFSET", "I", "Ljava/util/concurrent/Executor;", "appClientToken", "codelessDebugLogEnabled", "Ljava/lang/Boolean;", "Ljava/util/concurrent/atomic/AtomicLong;", "onProgressThreshold", "Ljava/util/concurrent/atomic/AtomicLong;", "isDebugEnabledField", "Z", "Lnl/d0;", "Lnl/d0;", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", "Ljava/util/concurrent/locks/ReentrantLock;", "MAX_REQUEST_CODE_RANGE", "ATTRIBUTION_PREFERENCES", "PUBLISH_ACTIVITY_PATH", "CALLBACK_OFFSET_CHANGED_AFTER_INIT", "CALLBACK_OFFSET_NEGATIVE", "APP_EVENT_PREFERENCES", "DATA_PROCESSING_OPTIONS_PREFERENCES", "APPLICATION_ID_PROPERTY", "APPLICATION_NAME_PROPERTY", "CLIENT_TOKEN_PROPERTY", "WEB_DIALOG_THEME", "AUTO_INIT_ENABLED_PROPERTY", "AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY", "CODELESS_DEBUG_LOG_ENABLED_PROPERTY", "ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY", "CALLBACK_OFFSET_PROPERTY", "MONITOR_ENABLED_PROPERTY", "DATA_PROCESSION_OPTIONS", "DATA_PROCESSION_OPTIONS_COUNTRY", "DATA_PROCESSION_OPTIONS_STATE", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "bypassAppSwitch", "INSTAGRAM", "GAMING", "FACEBOOK_COM", "FB_GG", "INSTAGRAM_COM", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sdkInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "instagramDomain", "Lxk/s;", "CLOUDBRIDGE_SAVED_CREDENTIALS", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FacebookSdk {

    @NotNull
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";

    @NotNull
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";

    @NotNull
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";

    @NotNull
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";

    @NotNull
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";

    @NotNull
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";

    @NotNull
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";

    @NotNull
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";

    @NotNull
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";

    @NotNull
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";

    @NotNull
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";

    @NotNull
    public static final String CLOUDBRIDGE_SAVED_CREDENTIALS = "com.facebook.sdk.CloudBridgeSavedCredentials";

    @NotNull
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";

    @NotNull
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";

    @NotNull
    public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";

    @NotNull
    public static final String FB_GG = "fb.gg";

    @NotNull
    public static final String GAMING = "gaming";

    @NotNull
    public static final String INSTAGRAM = "instagram";
    private static final int MAX_REQUEST_CODE_RANGE = 100;

    @NotNull
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";

    @NotNull
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";

    @NotNull
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    public static boolean bypassAppSwitch;
    private static d0 cacheDir;
    private static volatile Boolean codelessDebugLogEnabled;
    private static Executor executor;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;

    @NotNull
    public static final FacebookSdk INSTANCE = new FacebookSdk();
    private static final String TAG = FacebookSdk.class.getCanonicalName();

    @NotNull
    private static final HashSet<g0> loggingBehaviors = u0.a(g0.f40375f);

    @NotNull
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;

    @NotNull
    private static final ReentrantLock LOCK = new ReentrantLock();

    @NotNull
    private static String graphApiVersion = "v16.0";

    @NotNull
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    @NotNull
    public static final String INSTAGRAM_COM = "instagram.com";

    @NotNull
    private static volatile String instagramDomain = INSTAGRAM_COM;

    @NotNull
    public static final String FACEBOOK_COM = "facebook.com";

    @NotNull
    private static volatile String facebookDomain = FACEBOOK_COM;

    @NotNull
    private static s graphRequestCreator = new d(22);

    private FacebookSdk() {
    }

    public static final void addLoggingBehavior(@NotNull g0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<g0> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(behavior);
            INSTANCE.updateGraphDebugBehavior();
            Unit unit = Unit.f23355a;
        }
    }

    public static final void clearLoggingBehaviors() {
        HashSet<g0> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            Unit unit = Unit.f23355a;
        }
    }

    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        return n0.b();
    }

    @NotNull
    public static final Context getApplicationContext() {
        nl.n0.R();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.k("applicationContext");
        throw null;
    }

    @NotNull
    public static final String getApplicationId() {
        nl.n0.R();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String getApplicationName() {
        nl.n0.R();
        return applicationName;
    }

    public static final String getApplicationSignature(Context context) {
        PackageManager packageManager;
        if (a.b(FacebookSdk.class)) {
            return null;
        }
        try {
            nl.n0.R();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th2) {
            a.a(FacebookSdk.class, th2);
            return null;
        }
    }

    public static final boolean getAutoInitEnabled() {
        n0 n0Var = n0.f40443a;
        if (a.b(n0.class)) {
            return false;
        }
        try {
            n0.f40443a.d();
            return n0.f40446d.a();
        } catch (Throwable th2) {
            a.a(n0.class, th2);
            return false;
        }
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        n0 n0Var = n0.f40443a;
        if (a.b(n0.class)) {
            return false;
        }
        try {
            n0 n0Var2 = n0.f40443a;
            n0Var2.d();
            return n0Var2.a();
        } catch (Throwable th2) {
            a.a(n0.class, th2);
            return false;
        }
    }

    public static final File getCacheDir() {
        nl.n0.R();
        d0 d0Var = cacheDir;
        if (d0Var != null) {
            CountDownLatch countDownLatch = d0Var.f28848b;
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
            }
            return (File) d0Var.f28847a;
        }
        Intrinsics.k("cacheDir");
        throw null;
    }

    public static final int getCallbackRequestCodeOffset() {
        nl.n0.R();
        return callbackRequestCodeOffset;
    }

    @NotNull
    public static final String getClientToken() {
        nl.n0.R();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean getCodelessDebugLogEnabled() {
        nl.n0.R();
        Boolean bool = codelessDebugLogEnabled;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final boolean getCodelessSetupEnabled() {
        n0 n0Var = n0.f40443a;
        if (a.b(n0.class)) {
            return false;
        }
        try {
            n0.f40443a.d();
            return n0.f40449g.a();
        } catch (Throwable th2) {
            a.a(n0.class, th2);
            return false;
        }
    }

    @NotNull
    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.f23355a;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    @NotNull
    public static final String getFacebookGamingDomain() {
        return FB_GG;
    }

    @NotNull
    public static final String getGraphApiVersion() {
        String str = TAG;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        nl.n0.F(str, format);
        return graphApiVersion;
    }

    @NotNull
    public static final String getGraphDomain() {
        String str;
        Date date = xk.a.f40309l;
        xk.a q10 = h.q();
        if (q10 != null) {
            str = q10.f40322k;
        } else {
            str = null;
        }
        String facebookDomain2 = getFacebookDomain();
        if (str != null) {
            if (Intrinsics.a(str, GAMING)) {
                return kotlin.text.s.n(facebookDomain2, FACEBOOK_COM, FB_GG, false);
            }
            if (Intrinsics.a(str, INSTAGRAM)) {
                return kotlin.text.s.n(facebookDomain2, FACEBOOK_COM, INSTAGRAM_COM, false);
            }
            return facebookDomain2;
        }
        return facebookDomain2;
    }

    @NotNull
    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    public static final boolean getLimitEventAndDataUsage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        nl.n0.R();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    @NotNull
    public static final Set<g0> getLoggingBehaviors() {
        Set<g0> unmodifiableSet;
        HashSet<g0> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(loggingBehaviors))");
        }
        return unmodifiableSet;
    }

    public static final boolean getMonitorEnabled() {
        n0 n0Var = n0.f40443a;
        if (a.b(n0.class)) {
            return false;
        }
        try {
            n0.f40443a.d();
            return n0.f40450h.a();
        } catch (Throwable th2) {
            a.a(n0.class, th2);
            return false;
        }
    }

    public static final long getOnProgressThreshold() {
        nl.n0.R();
        return onProgressThreshold.get();
    }

    @NotNull
    public static final String getSdkVersion() {
        return "16.3.0";
    }

    /* renamed from: graphRequestCreator$lambda-0, reason: not valid java name */
    private static final z m10graphRequestCreator$lambda0(xk.a aVar, String str, JSONObject jSONObject, v vVar) {
        String str2 = z.f40475j;
        return e.y(aVar, str, jSONObject, vVar);
    }

    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    public static final boolean isFacebookRequestCode(int requestCode) {
        int i10 = callbackRequestCodeOffset;
        return requestCode >= i10 && requestCode < i10 + 100;
    }

    public static final synchronized boolean isFullyInitialized() {
        boolean z10;
        synchronized (FacebookSdk.class) {
            z10 = isFullyInitialized;
        }
        return z10;
    }

    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean isLoggingBehaviorEnabled(@NotNull g0 behavior) {
        boolean z10;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<g0> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            if (isDebugEnabled()) {
                if (hashSet.contains(behavior)) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return z10;
    }

    public static final void loadDefaultsFromMetadata$facebook_core_release(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (kotlin.text.s.r(lowerCase, "fb", false)) {
                        String substring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        applicationId = substring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
            }
            if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void publishInstallAndWaitForResponse(Context context, String applicationId2) {
        try {
            if (a.b(this)) {
                return;
            }
            try {
                String str = c.f28837f;
                c h10 = ll.e.h(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String i10 = Intrinsics.i("ping", applicationId2);
                long j10 = sharedPreferences.getLong(i10, 0L);
                try {
                    HashMap hashMap = gl.e.f17464a;
                    JSONObject a10 = gl.e.a(gl.d.f17461a, h10, l.f41701b.p(context), getLimitEventAndDataUsage(context), context);
                    String format = String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{applicationId2}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    ((d) graphRequestCreator).getClass();
                    z m10graphRequestCreator$lambda0 = m10graphRequestCreator$lambda0(null, format, a10, null);
                    if (j10 == 0 && m10graphRequestCreator$lambda0.c().f40344c == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(i10, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (JSONException e10) {
                    throw new RuntimeException("An error occurred while publishing install.", e10);
                }
            } catch (Exception e11) {
                nl.n0.E("Facebook-publish", e11);
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public static final void publishInstallAsync(@NotNull Context context, @NotNull String applicationId2) {
        if (a.b(FacebookSdk.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            getExecutor().execute(new m0(26, applicationContext2, applicationId2));
            nl.v vVar = nl.v.f28944a;
            if (nl.v.b(t.OnDeviceEventProcessing) && b.a()) {
                String str = ATTRIBUTION_PREFERENCES;
                if (!a.b(b.class)) {
                    try {
                        Context applicationContext3 = getApplicationContext();
                        if (applicationContext3 != null && applicationId2 != null) {
                            getExecutor().execute(new il.a(0, applicationContext3, str, applicationId2));
                        }
                    } catch (Throwable th2) {
                        a.a(b.class, th2);
                    }
                }
            }
        } catch (Throwable th3) {
            a.a(FacebookSdk.class, th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: publishInstallAsync$lambda-15, reason: not valid java name */
    public static final void m11publishInstallAsync$lambda15(Context applicationContext2, String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationContext2, "$applicationContext");
        Intrinsics.checkNotNullParameter(applicationId2, "$applicationId");
        INSTANCE.publishInstallAndWaitForResponse(applicationContext2, applicationId2);
    }

    public static final void removeLoggingBehavior(@NotNull g0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet<g0> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(behavior);
        }
    }

    @ut.a
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2, int callbackRequestCodeOffset2) {
        synchronized (FacebookSdk.class) {
            Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
            sdkInitialize(applicationContext2, callbackRequestCodeOffset2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-3, reason: not valid java name */
    public static final File m12sdkInitialize$lambda3() {
        Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.k("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-4, reason: not valid java name */
    public static final void m13sdkInitialize$lambda4(boolean z10) {
        if (z10 && getAutoLogAppEventsEnabled()) {
            nl.v vVar = nl.v.f28944a;
            nl.v.a(new w(2), t.CrashReport);
            nl.v.a(new w(3), t.ErrorReport);
            nl.v.a(new w(4), t.AnrReport);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-5, reason: not valid java name */
    public static final void m14sdkInitialize$lambda5(boolean z10) {
        if (z10 && !a.b(o.class)) {
            try {
                a0 a0Var = a0.f28827a;
                Object callback = new Object();
                Intrinsics.checkNotNullParameter(callback, "callback");
                a0.f28831e.add(callback);
                a0.d();
            } catch (Throwable th2) {
                a.a(o.class, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-6, reason: not valid java name */
    public static final void m15sdkInitialize$lambda6(boolean z10) {
        if (z10) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-7, reason: not valid java name */
    public static final void m16sdkInitialize$lambda7(boolean z10) {
        if (z10) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sdkInitialize$lambda-8, reason: not valid java name */
    public static final void m17sdkInitialize$lambda8(boolean z10) {
        if (z10) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, nl.m0] */
    /* renamed from: sdkInitialize$lambda-9, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Void m18sdkInitialize$lambda9(xk.t r21) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.m18sdkInitialize$lambda9(xk.t):java.lang.Void");
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean flag) {
        n0 n0Var = n0.f40443a;
        if (!a.b(n0.class)) {
            try {
                xk.m0 m0Var = n0.f40448f;
                m0Var.f40440c = Boolean.valueOf(flag);
                m0Var.f40441d = System.currentTimeMillis();
                boolean z10 = n0.f40444b.get();
                n0 n0Var2 = n0.f40443a;
                if (z10) {
                    n0Var2.l(m0Var);
                } else {
                    n0Var2.d();
                }
            } catch (Throwable th2) {
                a.a(n0.class, th2);
            }
        }
    }

    public static final void setApplicationId(@NotNull String applicationId2) {
        Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
        nl.n0.I(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    public static final void setApplicationName(String applicationName2) {
        applicationName = applicationName2;
    }

    public static final void setAutoInitEnabled(boolean flag) {
        n0 n0Var = n0.f40443a;
        if (!a.b(n0.class)) {
            try {
                xk.m0 m0Var = n0.f40446d;
                m0Var.f40440c = Boolean.valueOf(flag);
                m0Var.f40441d = System.currentTimeMillis();
                boolean z10 = n0.f40444b.get();
                n0 n0Var2 = n0.f40443a;
                if (z10) {
                    n0Var2.l(m0Var);
                } else {
                    n0Var2.d();
                }
            } catch (Throwable th2) {
                a.a(n0.class, th2);
            }
        }
        if (flag) {
            fullyInitialize();
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean flag) {
        n0 n0Var = n0.f40443a;
        if (!a.b(n0.class)) {
            try {
                xk.m0 m0Var = n0.f40447e;
                m0Var.f40440c = Boolean.valueOf(flag);
                m0Var.f40441d = System.currentTimeMillis();
                boolean z10 = n0.f40444b.get();
                n0 n0Var2 = n0.f40443a;
                if (z10) {
                    n0Var2.l(m0Var);
                } else {
                    n0Var2.d();
                }
            } catch (Throwable th2) {
                a.a(n0.class, th2);
            }
        }
        if (flag) {
            Application application = (Application) getApplicationContext();
            String str = gl.b.f17450a;
            gl.b.c(application, getApplicationId());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [nl.d0, java.lang.Object] */
    public static final void setCacheDir(@NotNull File cacheDir2) {
        Intrinsics.checkNotNullParameter(cacheDir2, "cacheDir");
        ?? obj = new Object();
        obj.f28847a = cacheDir2;
        cacheDir = obj;
    }

    public static final void setClientToken(String clientToken) {
        appClientToken = clientToken;
    }

    public static final void setCodelessDebugLogEnabled(boolean flag) {
        codelessDebugLogEnabled = Boolean.valueOf(flag);
    }

    public static final void setDataProcessingOptions(String[] options) {
        if (a.b(FacebookSdk.class)) {
            return;
        }
        try {
            setDataProcessingOptions(options, 0, 0);
        } catch (Throwable th2) {
            a.a(FacebookSdk.class, th2);
        }
    }

    public static final void setExecutor(@NotNull Executor executor2) {
        Intrinsics.checkNotNullParameter(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            Unit unit = Unit.f23355a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setFacebookDomain(@NotNull String facebookDomain2) {
        Intrinsics.checkNotNullParameter(facebookDomain2, "facebookDomain");
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = facebookDomain2;
    }

    public static final void setGraphApiVersion(@NotNull String graphApiVersion2) {
        Intrinsics.checkNotNullParameter(graphApiVersion2, "graphApiVersion");
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (!nl.n0.A(graphApiVersion2) && !Intrinsics.a(graphApiVersion, graphApiVersion2)) {
            graphApiVersion = graphApiVersion2;
        }
    }

    public static final void setGraphRequestCreator$facebook_core_release(@NotNull s graphRequestCreator2) {
        Intrinsics.checkNotNullParameter(graphRequestCreator2, "graphRequestCreator");
        graphRequestCreator = graphRequestCreator2;
    }

    public static final void setIsDebugEnabled(boolean enabled) {
        isDebugEnabledField = enabled;
    }

    public static final void setLegacyTokenUpgradeSupported(boolean supported) {
        isLegacyTokenUpgradeSupported = supported;
    }

    public static final void setLimitEventAndDataUsage(@NotNull Context context, boolean limitEventUsage) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", limitEventUsage).apply();
    }

    public static final void setMonitorEnabled(boolean flag) {
        n0 n0Var = n0.f40443a;
        if (!a.b(n0.class)) {
            try {
                xk.m0 m0Var = n0.f40450h;
                m0Var.f40440c = Boolean.valueOf(flag);
                m0Var.f40441d = System.currentTimeMillis();
                boolean z10 = n0.f40444b.get();
                n0 n0Var2 = n0.f40443a;
                if (z10) {
                    n0Var2.l(m0Var);
                } else {
                    n0Var2.d();
                }
            } catch (Throwable th2) {
                a.a(n0.class, th2);
            }
        }
    }

    public static final void setOnProgressThreshold(long threshold) {
        onProgressThreshold.set(threshold);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<g0> hashSet = loggingBehaviors;
        if (hashSet.contains(g0.f40377h)) {
            g0 g0Var = g0.f40376g;
            if (!hashSet.contains(g0Var)) {
                hashSet.add(g0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        com.facebook.FacebookSdk.callbackRequestCodeOffset = r3;
        sdkInitialize(r2, r4);
     */
    @ut.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void sdkInitialize(@org.jetbrains.annotations.NotNull android.content.Context r2, int r3, xk.t r4) {
        /*
            java.lang.Class<com.facebook.FacebookSdk> r0 = com.facebook.FacebookSdk.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicBoolean r1 = com.facebook.FacebookSdk.sdkInitialized     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            int r1 = com.facebook.FacebookSdk.callbackRequestCodeOffset     // Catch: java.lang.Throwable -> L1d
            if (r3 != r1) goto L15
            goto L1f
        L15:
            com.facebook.FacebookException r2 = new com.facebook.FacebookException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L1d:
            r2 = move-exception
            goto L30
        L1f:
            if (r3 < 0) goto L28
            com.facebook.FacebookSdk.callbackRequestCodeOffset = r3     // Catch: java.lang.Throwable -> L1d
            sdkInitialize(r2, r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L28:
            com.facebook.FacebookException r2 = new com.facebook.FacebookException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "The callback request code offset can't be negative."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L30:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.sdkInitialize(android.content.Context, int, xk.t):void");
    }

    public static final void setDataProcessingOptions(String[] options, int country, int state) {
        if (a.b(FacebookSdk.class)) {
            return;
        }
        if (options == null) {
            try {
                options = new String[0];
            } catch (Throwable th2) {
                a.a(FacebookSdk.class, th2);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DATA_PROCESSION_OPTIONS, new JSONArray((Collection) vt.v.y(options)));
            jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, country);
            jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, state);
            Context context = applicationContext;
            if (context != null) {
                context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
            } else {
                Intrinsics.k("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    @ut.a
    public static final synchronized void sdkInitialize(@NotNull Context applicationContext2) {
        synchronized (FacebookSdk.class) {
            Intrinsics.checkNotNullParameter(applicationContext2, "applicationContext");
            sdkInitialize(applicationContext2, (xk.t) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x001b, B:14:0x0028, B:16:0x002f, B:18:0x0037, B:19:0x003e, B:21:0x004c, B:22:0x0053, B:24:0x0067, B:26:0x006e, B:28:0x0074, B:30:0x0078, B:32:0x007e, B:34:0x0089, B:35:0x008c, B:37:0x0090, B:39:0x0094, B:44:0x00aa, B:46:0x00b0, B:47:0x00b8, B:48:0x00bd, B:51:0x00bf, B:52:0x00c2, B:54:0x00ce, B:57:0x014c, B:58:0x0151, B:59:0x0152, B:60:0x0157, B:61:0x0158, B:62:0x015f, B:63:0x0160, B:64:0x0167, B:65:0x0168, B:66:0x016d, B:42:0x009f), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: all -> 0x0018, TryCatch #1 {, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x001b, B:14:0x0028, B:16:0x002f, B:18:0x0037, B:19:0x003e, B:21:0x004c, B:22:0x0053, B:24:0x0067, B:26:0x006e, B:28:0x0074, B:30:0x0078, B:32:0x007e, B:34:0x0089, B:35:0x008c, B:37:0x0090, B:39:0x0094, B:44:0x00aa, B:46:0x00b0, B:47:0x00b8, B:48:0x00bd, B:51:0x00bf, B:52:0x00c2, B:54:0x00ce, B:57:0x014c, B:58:0x0151, B:59:0x0152, B:60:0x0157, B:61:0x0158, B:62:0x015f, B:63:0x0160, B:64:0x0167, B:65:0x0168, B:66:0x016d, B:42:0x009f), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: all -> 0x0018, TryCatch #1 {, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x001b, B:14:0x0028, B:16:0x002f, B:18:0x0037, B:19:0x003e, B:21:0x004c, B:22:0x0053, B:24:0x0067, B:26:0x006e, B:28:0x0074, B:30:0x0078, B:32:0x007e, B:34:0x0089, B:35:0x008c, B:37:0x0090, B:39:0x0094, B:44:0x00aa, B:46:0x00b0, B:47:0x00b8, B:48:0x00bd, B:51:0x00bf, B:52:0x00c2, B:54:0x00ce, B:57:0x014c, B:58:0x0151, B:59:0x0152, B:60:0x0157, B:61:0x0158, B:62:0x015f, B:63:0x0160, B:64:0x0167, B:65:0x0168, B:66:0x016d, B:42:0x009f), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168 A[Catch: all -> 0x0018, TryCatch #1 {, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x001b, B:14:0x0028, B:16:0x002f, B:18:0x0037, B:19:0x003e, B:21:0x004c, B:22:0x0053, B:24:0x0067, B:26:0x006e, B:28:0x0074, B:30:0x0078, B:32:0x007e, B:34:0x0089, B:35:0x008c, B:37:0x0090, B:39:0x0094, B:44:0x00aa, B:46:0x00b0, B:47:0x00b8, B:48:0x00bd, B:51:0x00bf, B:52:0x00c2, B:54:0x00ce, B:57:0x014c, B:58:0x0151, B:59:0x0152, B:60:0x0157, B:61:0x0158, B:62:0x015f, B:63:0x0160, B:64:0x0167, B:65:0x0168, B:66:0x016d, B:42:0x009f), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r6v18, types: [nl.d0, java.lang.Object] */
    @ut.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void sdkInitialize(@org.jetbrains.annotations.NotNull android.content.Context r6, xk.t r7) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.sdkInitialize(android.content.Context, xk.t):void");
    }
}
