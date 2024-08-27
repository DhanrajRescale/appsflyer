package com.assetgro.stockgro.data.remote;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.graphics.drawable.IconCompat;
import b4.f;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.q;
import com.google.firebase.messaging.r;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.webengage.sdk.android.WebEngage;
import ek.u;
import in.juspay.hyper.constants.LogCategory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kj.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import q3.a1;
import q3.b0;
import q3.b1;
import q3.c0;
import q3.d0;
import q3.f0;
import q3.v;
import t.j0;
import vt.g0;
import vt.y;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b5\u00106J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J$\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J2\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0002J4\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010#\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010$\u001a\u00020\u000fH\u0002J(\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00060&j\b\u0012\u0004\u0012\u00020\u0006`'2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0006H\u0002J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J*\u0010,\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0016¨\u00068"}, d2 = {"Lcom/assetgro/stockgro/data/remote/StockGroFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/net/Uri;", "sound", HttpUrl.FRAGMENT_ENCODE_SET, "createNotificationChannel", "Lcom/google/firebase/messaging/r;", "remoteMessage", HttpUrl.FRAGMENT_ENCODE_SET, "createChatNotification", "deepLinkPath", "deepLinkIdentifier", "createGeneralDataNotification", HttpUrl.FRAGMENT_ENCODE_SET, "channelIdentifier", "channelNameIdentifier", "channelDescriptionIdentifier", "createNotificationChannelForModules", "imageUrl", "Landroid/graphics/Bitmap;", "getBitmapfromUrl", "senderId", HttpUrl.FRAGMENT_ENCODE_SET, "isMessageFromCurrentUser", "channelId", "Lq3/d0;", "getGroupSummary", "groupId", "notificationId", "title", "body", "getNotificationBuilder", "getGeneralNotificationBuilder", "getNotificationID", "getGeneratedID", "newMessage", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMessageData", "handleDataNotifications", "createDeepLinkNotification", "deepLink", "getDeeplinkNotificationBuilder", "Landroid/content/Context;", LogCategory.CONTEXT, "deeplink", "Lq3/v;", "createSafeDropAction", "onMessageReceived", "newToken", "onNewToken", "<init>", "()V", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGroFirebaseMessagingService extends FirebaseMessagingService {
    public static final int $stable = 0;
    public static final int GENERAL_NOTIFICATION_ID = 102;

    @NotNull
    public static final String GROUP_KEY_CHAT_NOTIFICATION = "CHAT_NOTIFICATION";

    @NotNull
    public static final String MESSAGES = "MESSAGES_LIST";
    public static final int SUMMARY_ID = 101;

    @NotNull
    public static final String TAG = "StockGroFirebaseMessagingService";

    private final void createChatNotification(r remoteMessage) {
        String str;
        String str2;
        try {
            String str3 = (String) remoteMessage.getData().get("group_id");
            String str4 = (String) remoteMessage.getData().get("title");
            String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str4 == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = str4;
            }
            String str6 = (String) remoteMessage.getData().get("body");
            if (str6 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str2 = str6;
            }
            String str7 = (String) remoteMessage.getData().get("sender_id");
            if (str7 != null) {
                str5 = str7;
            }
            int notificationID = getNotificationID(str3);
            if (isMessageFromCurrentUser(str5)) {
                return;
            }
            Object systemService = getSystemService("notification");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            String createNotificationChannelForModules = createNotificationChannelForModules(notificationManager, R.string.text_chat_channel_id, R.string.text_chat_channel_name, R.string.text_chat_channel_description);
            remoteMessage.getData();
            d0 groupSummary = getGroupSummary(createNotificationChannelForModules);
            Notification a10 = getNotificationBuilder(createNotificationChannelForModules, str3, notificationID, str, str2).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            Notification a11 = groupSummary.a();
            Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
            notificationManager.notify(notificationID, a10);
            notificationManager.notify(101, a11);
            sendBroadcast(new Intent("REFRESH_MESSAGE_COUNT_CODE"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private final void createDeepLinkNotification(r remoteMessage) {
        try {
            String str = (String) remoteMessage.getData().get("title");
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str3 = (String) remoteMessage.getData().get("body");
            if (str3 != null) {
                str2 = str3;
            }
            String str4 = (String) remoteMessage.getData().get("android_deep_link");
            Object systemService = getSystemService("notification");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            String createNotificationChannelForModules = createNotificationChannelForModules(notificationManager, R.string.text_notification_channel_id, R.string.text_notification_channel_name, R.string.text_notification_channel_description);
            remoteMessage.getData();
            Notification a10 = getDeeplinkNotificationBuilder(createNotificationChannelForModules, str, str2, str4).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            notificationManager.notify(102, a10);
            sendBroadcast(new Intent("REFRESH_MESSAGE_COUNT_CODE"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private final void createGeneralDataNotification(r remoteMessage, String deepLinkPath, String deepLinkIdentifier) {
        String str;
        String str2;
        try {
            String str3 = (String) remoteMessage.getData().get("title");
            if (str3 == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = str3;
            }
            String str4 = (String) remoteMessage.getData().get("body");
            if (str4 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str2 = str4;
            }
            Object systemService = getSystemService("notification");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            String createNotificationChannelForModules = createNotificationChannelForModules(notificationManager, R.string.text_notification_channel_id, R.string.text_notification_channel_name, R.string.text_notification_channel_description);
            remoteMessage.getData();
            Notification a10 = getGeneralNotificationBuilder(createNotificationChannelForModules, str, str2, deepLinkPath, deepLinkIdentifier).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            notificationManager.notify(102, a10);
            sendBroadcast(new Intent("REFRESH_MESSAGE_COUNT_CODE"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private final String createNotificationChannel(NotificationManager notificationManager, Uri sound) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.n();
            NotificationChannel c10 = f.c();
            c10.setDescription("Allows the app to notify users about push messages");
            c10.enableLights(true);
            c10.enableVibration(true);
            c10.setSound(sound, new AudioAttributes.Builder().setUsage(5).build());
            notificationManager.createNotificationChannel(c10);
            return "push_message_service";
        }
        return "push_message_service";
    }

    private final String createNotificationChannelForModules(NotificationManager notificationManager, int channelIdentifier, int channelNameIdentifier, int channelDescriptionIdentifier) {
        String string = getString(channelIdentifier);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (Build.VERSION.SDK_INT >= 26) {
            f.n();
            NotificationChannel g10 = f.g(string, getString(channelNameIdentifier));
            g10.setDescription(getString(channelDescriptionIdentifier));
            g10.enableLights(true);
            g10.enableVibration(true);
            notificationManager.createNotificationChannel(g10);
        }
        return string;
    }

    private final v createSafeDropAction(Context context, String deeplink) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(deeplink));
        b1 b1Var = new b1(context);
        Intrinsics.checkNotNullExpressionValue(b1Var, "create(...)");
        b1Var.b(intent);
        ArrayList arrayList = b1Var.f31584a;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return new v(2131231848, "StockGro", a1.a(b1Var.f31585b, 0, intentArr, 134217728, null));
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    private final Bitmap getBitmapfromUrl(Uri imageUrl) {
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(String.valueOf(imageUrl)).openConnection());
            Intrinsics.d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private final d0 getDeeplinkNotificationBuilder(String channelId, String title, String body, String deepLink) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(deepLink));
        intent.putExtra("LAUNCHED_BY_NOTIFICATION", true);
        byte[] bArr = a.f23206a;
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        d0 d0Var = new d0(this, channelId);
        d0Var.f31609x.icon = 2131231848;
        d0Var.f31590e = d0.b(title);
        d0Var.f31591f = d0.b(body);
        d0Var.f31592g = activity;
        d0Var.f31595j = 1;
        d0Var.c(16, true);
        b0 b0Var = new b0(0);
        b0Var.f31583f = d0.b(body);
        d0Var.e(b0Var);
        Intrinsics.checkNotNullExpressionValue(d0Var, "setStyle(...)");
        return d0Var;
    }

    private final d0 getGeneralNotificationBuilder(String channelId, String title, String body, String deepLinkPath, String deepLinkIdentifier) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("LAUNCHED_BY_NOTIFICATION", true);
        intent.putExtra("DEEP_LINK_PATH", deepLinkPath);
        intent.putExtra("DEEP_LINK_PATH_IDENTIFIER", deepLinkIdentifier);
        intent.setFlags(67108864);
        byte[] bArr = a.f23206a;
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        d0 d0Var = new d0(this, channelId);
        d0Var.f31609x.icon = 2131231848;
        d0Var.f31590e = d0.b(title);
        d0Var.f31591f = d0.b(body);
        d0Var.f31592g = activity;
        d0Var.f31595j = 1;
        d0Var.c(16, true);
        b0 b0Var = new b0(0);
        b0Var.f31583f = d0.b(body);
        d0Var.e(b0Var);
        Intrinsics.checkNotNullExpressionValue(d0Var, "setStyle(...)");
        return d0Var;
    }

    private final int getGeneratedID() {
        return new Random(System.currentTimeMillis()).nextInt(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
    }

    private final d0 getGroupSummary(String channelId) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        byte[] bArr = a.f23206a;
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        d0 d0Var = new d0(this, channelId);
        d0Var.f31609x.icon = 2131231848;
        d0Var.e(new b0(1));
        d0Var.f31601p = GROUP_KEY_CHAT_NOTIFICATION;
        d0Var.f31602q = true;
        d0Var.f31595j = 1;
        d0Var.f31592g = activity;
        d0Var.c(16, true);
        Intrinsics.checkNotNullExpressionValue(d0Var, "setAutoCancel(...)");
        return d0Var;
    }

    private final ArrayList<String> getMessageData(int notificationId, String newMessage) {
        Object systemService = getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
        Intrinsics.c(activeNotifications);
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getId() == notificationId) {
                ArrayList<String> arrayList = (ArrayList) statusBarNotification.getNotification().extras.get(MESSAGES);
                if (arrayList != null && !arrayList.isEmpty()) {
                    arrayList.add(newMessage);
                    return arrayList;
                }
                return y.c(newMessage);
            }
        }
        return y.c(newMessage);
    }

    private final d0 getNotificationBuilder(String channelId, String groupId, int notificationId, String title, String body) {
        List<String> list;
        Intent intent = new Intent(this, (Class<?>) GroupDetailHostActivity.class);
        intent.putExtra("GROUP_CHAT_ID", groupId);
        intent.putExtra("LAUNCHED_BY_NOTIFICATION", true);
        intent.setFlags(67108864);
        byte[] bArr = a.f23206a;
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        ArrayList<String> messageData = getMessageData(notificationId, body);
        d0 d0Var = new d0(this, channelId);
        d0Var.f31609x.icon = 2131231848;
        d0Var.f31590e = d0.b(title);
        d0Var.f31591f = d0.b(body);
        d0Var.f31592g = activity;
        d0Var.f31595j = 1;
        d0Var.f31601p = GROUP_KEY_CHAT_NOTIFICATION;
        d0Var.c(16, true);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(MESSAGES, messageData);
        d0Var.f31604s = bundle;
        Intrinsics.checkNotNullExpressionValue(d0Var, "setExtras(...)");
        b0 b0Var = new b0(1);
        if (messageData != null && !messageData.isEmpty()) {
            Intrinsics.checkNotNullParameter(messageData, "<this>");
            int size = messageData.size();
            if (7 >= size) {
                list = g0.R(messageData);
            } else {
                ArrayList arrayList = new ArrayList(7);
                for (int i10 = size - 7; i10 < size; i10++) {
                    arrayList.add(messageData.get(i10));
                }
                list = arrayList;
            }
            for (String str : list) {
                if (str != null) {
                    ((ArrayList) b0Var.f31583f).add(d0.b(str));
                }
            }
            String string = getString(R.string.text_notification_message_count);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(messageData.size())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            b0Var.f31613c = d0.b(format);
            b0Var.f31614d = true;
            d0Var.e(b0Var);
        }
        return d0Var;
    }

    private final int getNotificationID(String groupId) {
        if (groupId != null) {
            return groupId.hashCode();
        }
        return getGeneratedID();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002c. Please report as an issue. */
    private final void handleDataNotifications(r remoteMessage) {
        Map data = remoteMessage.getData();
        CharSequence charSequence = (CharSequence) data.get("android_deep_link");
        if (charSequence != null && charSequence.length() != 0) {
            createDeepLinkNotification(remoteMessage);
            return;
        }
        String str = (String) data.get("notification_type");
        if (str != null) {
            switch (str.hashCode()) {
                case -2022883761:
                    if (str.equals("League")) {
                        createGeneralDataNotification(remoteMessage, "arena", HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    break;
                case -1813183603:
                    if (str.equals("Social")) {
                        String str2 = (String) data.get("target_section");
                        if (str2 != null && str2.length() != 0) {
                            createChatNotification(remoteMessage);
                            return;
                        } else {
                            createGeneralDataNotification(remoteMessage, "social", HttpUrl.FRAGMENT_ENCODE_SET);
                            return;
                        }
                    }
                    break;
                case -1169218264:
                    if (str.equals("Portfolio")) {
                        createGeneralDataNotification(remoteMessage, "portfolio", HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    break;
                case 877971942:
                    if (str.equals("Payment")) {
                        createGeneralDataNotification(remoteMessage, "wallet", HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    break;
                case 1355227529:
                    if (str.equals("Profile")) {
                        createGeneralDataNotification(remoteMessage, "wallet", HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    break;
            }
        }
        createGeneralDataNotification(remoteMessage, "home", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private final boolean isMessageFromCurrentUser(String senderId) {
        String string;
        if (senderId == null || (string = getSharedPreferences("assetgro_stockgro_pref", 0).getString("UUID", HttpUrl.FRAGMENT_ENCODE_SET)) == null || string.length() == 0 || !string.equals(senderId)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [q3.f0, q3.z] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull r remoteMessage) {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        if (remoteMessage.getData() != null) {
            Intrinsics.checkNotNullExpressionValue(remoteMessage.getData(), "getData(...)");
            if (!((j0) r0).isEmpty()) {
                t.f fVar = (t.f) remoteMessage.getData();
                if (fVar.containsKey("source") && "webengage".equals(fVar.get("source"))) {
                    WebEngage.get().receive(fVar);
                    return;
                }
                handleDataNotifications(remoteMessage);
                fVar.toString();
                qv.a.a(new Object[0]);
                return;
            }
        }
        if (remoteMessage.f11777c == null) {
            Bundle bundle = remoteMessage.f11775a;
            if (u.B(bundle)) {
                remoteMessage.f11777c = new q(new u(bundle));
            }
        }
        q qVar = remoteMessage.f11777c;
        if (qVar != null) {
            String str = qVar.f11774c;
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            if (uri != null) {
                if (str != null) {
                    uri2 = Uri.parse(str);
                } else {
                    uri2 = null;
                }
                bitmap = getBitmapfromUrl(uri2);
            } else {
                bitmap = null;
            }
            Object systemService = getSystemService("notification");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            Uri parse = Uri.parse("android.resource://" + getPackageName() + "/2131951618");
            Intrinsics.c(parse);
            d0 d0Var = new d0(this, createNotificationChannel(notificationManager, parse));
            d0Var.f31609x.icon = 2131231848;
            String str2 = qVar.f11772a;
            d0Var.f31590e = d0.b(str2);
            String str3 = qVar.f11773b;
            d0Var.f31591f = d0.b(str3);
            d0Var.f31595j = 1;
            Notification notification = d0Var.f31609x;
            notification.sound = parse;
            notification.audioStreamType = -1;
            notification.audioAttributes = c0.a(c0.e(c0.c(c0.b(), 4), 5));
            d0Var.c(16, true);
            Intrinsics.checkNotNullExpressionValue(d0Var, "setAutoCancel(...)");
            if (bitmap != null) {
                ?? f0Var = new f0();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f1505b = bitmap;
                f0Var.f31653e = iconCompat;
                d0 d0Var2 = f0Var.f31611a;
                if (d0Var2 != null) {
                    d0Var2.a();
                }
                f0Var.f31612b = d0.b(str2);
                f0Var.f31613c = d0.b(str3);
                f0Var.f31614d = true;
                f0Var.f31654f = null;
                f0Var.f31655g = true;
                d0Var.d(BitmapFactory.decodeResource(getResources(), 2131231848));
                d0Var.e(f0Var);
            }
            notificationManager.notify(190, d0Var.a());
            sendBroadcast(new Intent("REFRESH_NOTIFICATION_COUNT_CODE"));
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        WebEngage.get().setRegistrationID(newToken);
        SharedPreferences.Editor edit = getSharedPreferences("assetgro_stockgro_pref", 0).edit();
        edit.putString("NEW_FIREBASE_TOKEN", newToken);
        edit.apply();
    }
}
