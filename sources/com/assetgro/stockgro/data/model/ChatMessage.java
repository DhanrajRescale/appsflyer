package com.assetgro.stockgro.data.model;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import v.e;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020\u0019¢\u0006\u0002\u0010%J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010^\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010`\u001a\u00020\u0010HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010b\u001a\u00020\u0017HÆ\u0003J\t\u0010c\u001a\u00020\u0019HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0019HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010k\u001a\u00020\u0019HÆ\u0003J\t\u0010l\u001a\u00020\u0019HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¸\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u0019HÆ\u0001¢\u0006\u0002\u0010uJ\t\u0010v\u001a\u00020\u0017HÖ\u0001J\u0013\u0010w\u001a\u00020\u00192\b\u0010x\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\u0017HÖ\u0001J\t\u0010{\u001a\u00020\u0003HÖ\u0001J\u001a\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u001e\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u00100\"\u0004\b1\u00102R\u001e\u0010#\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u00100\"\u0004\b3\u00102R\u001e\u0010$\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u00100\"\u0004\b4\u00102R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u00100\"\u0004\b5\u00102R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R \u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010.\"\u0004\bA\u0010BR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R \u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\bN\u0010'R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010.R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010Y¨\u0006\u0081\u0001"}, d2 = {"Lcom/assetgro/stockgro/data/model/ChatMessage;", "Landroid/os/Parcelable;", "messageId", HttpUrl.FRAGMENT_ENCODE_SET, "message", "template", "senderId", "senderPicture", "senderGroupRole", "senderGlobalRole", "senderName", "groupId", "parentMessageId", "threadInfo", "Lcom/assetgro/stockgro/data/model/ThreadInfo;", "editedAt", HttpUrl.FRAGMENT_ENCODE_SET, "clientTime", "serverTime", "updatedAt", "media", "Lcom/assetgro/stockgro/data/model/Media;", "totalLikes", HttpUrl.FRAGMENT_ENCODE_SET, "isTemporary", HttpUrl.FRAGMENT_ENCODE_SET, "messageInteraction", "Lcom/assetgro/stockgro/data/model/MessageInteraction;", "isPinned", "forwardDepth", "forwardSource", "mentions", "Lcom/assetgro/stockgro/data/model/Mentions;", "mentionsInfo", "Lcom/assetgro/stockgro/data/model/MentionsInfo;", "isReported", "isSenderReported", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ThreadInfo;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JLcom/assetgro/stockgro/data/model/Media;IZLcom/assetgro/stockgro/data/model/MessageInteraction;ZLjava/lang/Integer;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/Mentions;Lcom/assetgro/stockgro/data/model/MentionsInfo;ZZ)V", "getClientTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEditedAt", "getForwardDepth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getForwardSource", "()Ljava/lang/String;", "getGroupId", "()Z", "setPinned", "(Z)V", "setReported", "setSenderReported", "setTemporary", "getMedia", "()Lcom/assetgro/stockgro/data/model/Media;", "getMentions", "()Lcom/assetgro/stockgro/data/model/Mentions;", "setMentions", "(Lcom/assetgro/stockgro/data/model/Mentions;)V", "getMentionsInfo", "()Lcom/assetgro/stockgro/data/model/MentionsInfo;", "setMentionsInfo", "(Lcom/assetgro/stockgro/data/model/MentionsInfo;)V", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getMessageId", "getMessageInteraction", "()Lcom/assetgro/stockgro/data/model/MessageInteraction;", "setMessageInteraction", "(Lcom/assetgro/stockgro/data/model/MessageInteraction;)V", "getParentMessageId", "getSenderGlobalRole", "getSenderGroupRole", "getSenderId", "getSenderName", "getSenderPicture", "getServerTime", "getTemplate", "getThreadInfo", "()Lcom/assetgro/stockgro/data/model/ThreadInfo;", "setThreadInfo", "(Lcom/assetgro/stockgro/data/model/ThreadInfo;)V", "getTotalLikes", "()I", "setTotalLikes", "(I)V", "getUpdatedAt", "()J", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/ThreadInfo;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JLcom/assetgro/stockgro/data/model/Media;IZLcom/assetgro/stockgro/data/model/MessageInteraction;ZLjava/lang/Integer;Ljava/lang/String;Lcom/assetgro/stockgro/data/model/Mentions;Lcom/assetgro/stockgro/data/model/MentionsInfo;ZZ)Lcom/assetgro/stockgro/data/model/ChatMessage;", "describeContents", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChatMessage implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ChatMessage> CREATOR = new Creator();

    @SerializedName("client_time_micros")
    private final Long clientTime;

    @SerializedName("edited_at_secs")
    private final Long editedAt;

    @SerializedName("forward_depth")
    private final Integer forwardDepth;

    @SerializedName("forward_source")
    private final String forwardSource;

    @SerializedName("group_id")
    private final String groupId;

    @SerializedName("is_pinned")
    private boolean isPinned;

    @SerializedName("is_reported")
    private boolean isReported;

    @SerializedName("is_sender_reported")
    private boolean isSenderReported;

    @SerializedName("is_temporary")
    private boolean isTemporary;

    @SerializedName("media")
    private final Media media;

    @SerializedName("mentions")
    private Mentions mentions;

    @SerializedName("mentions_info")
    private MentionsInfo mentionsInfo;

    @SerializedName("n_template")
    private String message;

    @SerializedName("message_id")
    @NotNull
    private final String messageId;

    @SerializedName("interaction")
    private MessageInteraction messageInteraction;

    @SerializedName("replied_to")
    private final String parentMessageId;

    @SerializedName("sender_global_role")
    private final String senderGlobalRole;

    @SerializedName("sender_group_role")
    private final String senderGroupRole;

    @SerializedName("sender_id")
    private final String senderId;

    @SerializedName("sender_name")
    private final String senderName;

    @SerializedName("sender_picture")
    private final String senderPicture;

    @SerializedName("server_time_micros")
    private final Long serverTime;

    @SerializedName("template")
    private final String template;

    @SerializedName("replies_info")
    private ThreadInfo threadInfo;

    @SerializedName("total_likes")
    private int totalLikes;

    @SerializedName("updated_at_micros")
    private final long updatedAt;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ChatMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChatMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatMessage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ThreadInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : Media.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : MessageInteraction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Mentions.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MentionsInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ChatMessage[] newArray(int i10) {
            return new ChatMessage[i10];
        }
    }

    public ChatMessage(@NotNull String messageId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ThreadInfo threadInfo, Long l10, Long l11, Long l12, long j10, Media media, int i10, boolean z10, MessageInteraction messageInteraction, boolean z11, Integer num, String str10, Mentions mentions, MentionsInfo mentionsInfo, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.message = str;
        this.template = str2;
        this.senderId = str3;
        this.senderPicture = str4;
        this.senderGroupRole = str5;
        this.senderGlobalRole = str6;
        this.senderName = str7;
        this.groupId = str8;
        this.parentMessageId = str9;
        this.threadInfo = threadInfo;
        this.editedAt = l10;
        this.clientTime = l11;
        this.serverTime = l12;
        this.updatedAt = j10;
        this.media = media;
        this.totalLikes = i10;
        this.isTemporary = z10;
        this.messageInteraction = messageInteraction;
        this.isPinned = z11;
        this.forwardDepth = num;
        this.forwardSource = str10;
        this.mentions = mentions;
        this.mentionsInfo = mentionsInfo;
        this.isReported = z12;
        this.isSenderReported = z13;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* renamed from: component11, reason: from getter */
    public final ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getEditedAt() {
        return this.editedAt;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getServerTime() {
        return this.serverTime;
    }

    /* renamed from: component15, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component16, reason: from getter */
    public final Media getMedia() {
        return this.media;
    }

    /* renamed from: component17, reason: from getter */
    public final int getTotalLikes() {
        return this.totalLikes;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsTemporary() {
        return this.isTemporary;
    }

    /* renamed from: component19, reason: from getter */
    public final MessageInteraction getMessageInteraction() {
        return this.messageInteraction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsPinned() {
        return this.isPinned;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getForwardDepth() {
        return this.forwardDepth;
    }

    /* renamed from: component22, reason: from getter */
    public final String getForwardSource() {
        return this.forwardSource;
    }

    /* renamed from: component23, reason: from getter */
    public final Mentions getMentions() {
        return this.mentions;
    }

    /* renamed from: component24, reason: from getter */
    public final MentionsInfo getMentionsInfo() {
        return this.mentionsInfo;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsReported() {
        return this.isReported;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsSenderReported() {
        return this.isSenderReported;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSenderPicture() {
        return this.senderPicture;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSenderGroupRole() {
        return this.senderGroupRole;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSenderGlobalRole() {
        return this.senderGlobalRole;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final ChatMessage copy(@NotNull String messageId, String message, String template, String senderId, String senderPicture, String senderGroupRole, String senderGlobalRole, String senderName, String groupId, String parentMessageId, ThreadInfo threadInfo, Long editedAt, Long clientTime, Long serverTime, long updatedAt, Media media, int totalLikes, boolean isTemporary, MessageInteraction messageInteraction, boolean isPinned, Integer forwardDepth, String forwardSource, Mentions mentions, MentionsInfo mentionsInfo, boolean isReported, boolean isSenderReported) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new ChatMessage(messageId, message, template, senderId, senderPicture, senderGroupRole, senderGlobalRole, senderName, groupId, parentMessageId, threadInfo, editedAt, clientTime, serverTime, updatedAt, media, totalLikes, isTemporary, messageInteraction, isPinned, forwardDepth, forwardSource, mentions, mentionsInfo, isReported, isSenderReported);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) other;
        return Intrinsics.a(this.messageId, chatMessage.messageId) && Intrinsics.a(this.message, chatMessage.message) && Intrinsics.a(this.template, chatMessage.template) && Intrinsics.a(this.senderId, chatMessage.senderId) && Intrinsics.a(this.senderPicture, chatMessage.senderPicture) && Intrinsics.a(this.senderGroupRole, chatMessage.senderGroupRole) && Intrinsics.a(this.senderGlobalRole, chatMessage.senderGlobalRole) && Intrinsics.a(this.senderName, chatMessage.senderName) && Intrinsics.a(this.groupId, chatMessage.groupId) && Intrinsics.a(this.parentMessageId, chatMessage.parentMessageId) && Intrinsics.a(this.threadInfo, chatMessage.threadInfo) && Intrinsics.a(this.editedAt, chatMessage.editedAt) && Intrinsics.a(this.clientTime, chatMessage.clientTime) && Intrinsics.a(this.serverTime, chatMessage.serverTime) && this.updatedAt == chatMessage.updatedAt && Intrinsics.a(this.media, chatMessage.media) && this.totalLikes == chatMessage.totalLikes && this.isTemporary == chatMessage.isTemporary && Intrinsics.a(this.messageInteraction, chatMessage.messageInteraction) && this.isPinned == chatMessage.isPinned && Intrinsics.a(this.forwardDepth, chatMessage.forwardDepth) && Intrinsics.a(this.forwardSource, chatMessage.forwardSource) && Intrinsics.a(this.mentions, chatMessage.mentions) && Intrinsics.a(this.mentionsInfo, chatMessage.mentionsInfo) && this.isReported == chatMessage.isReported && this.isSenderReported == chatMessage.isSenderReported;
    }

    public final Long getClientTime() {
        return this.clientTime;
    }

    public final Long getEditedAt() {
        return this.editedAt;
    }

    public final Integer getForwardDepth() {
        return this.forwardDepth;
    }

    public final String getForwardSource() {
        return this.forwardSource;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Media getMedia() {
        return this.media;
    }

    public final Mentions getMentions() {
        return this.mentions;
    }

    public final MentionsInfo getMentionsInfo() {
        return this.mentionsInfo;
    }

    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public final MessageInteraction getMessageInteraction() {
        return this.messageInteraction;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final String getSenderGlobalRole() {
        return this.senderGlobalRole;
    }

    public final String getSenderGroupRole() {
        return this.senderGroupRole;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final String getSenderPicture() {
        return this.senderPicture;
    }

    public final Long getServerTime() {
        return this.serverTime;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    public final int getTotalLikes() {
        return this.totalLikes;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
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
        int hashCode19 = this.messageId.hashCode() * 31;
        String str = this.message;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode19 + hashCode) * 31;
        String str2 = this.template;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.senderId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.senderPicture;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.senderGroupRole;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.senderGlobalRole;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str7 = this.senderName;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str8 = this.groupId;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str9 = this.parentMessageId;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        ThreadInfo threadInfo = this.threadInfo;
        if (threadInfo == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = threadInfo.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Long l10 = this.editedAt;
        if (l10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l10.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        Long l11 = this.clientTime;
        if (l11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l11.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        Long l12 = this.serverTime;
        if (l12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l12.hashCode();
        }
        int c10 = e.c(this.updatedAt, (i22 + hashCode13) * 31, 31);
        Media media = this.media;
        if (media == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = media.hashCode();
        }
        int d10 = e.d(this.isTemporary, da.e.f(this.totalLikes, (c10 + hashCode14) * 31, 31), 31);
        MessageInteraction messageInteraction = this.messageInteraction;
        if (messageInteraction == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = messageInteraction.hashCode();
        }
        int d11 = e.d(this.isPinned, (d10 + hashCode15) * 31, 31);
        Integer num = this.forwardDepth;
        if (num == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num.hashCode();
        }
        int i23 = (d11 + hashCode16) * 31;
        String str10 = this.forwardSource;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        Mentions mentions = this.mentions;
        if (mentions == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = mentions.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        MentionsInfo mentionsInfo = this.mentionsInfo;
        if (mentionsInfo != null) {
            i10 = mentionsInfo.hashCode();
        }
        return Boolean.hashCode(this.isSenderReported) + e.d(this.isReported, (i25 + i10) * 31, 31);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isReported() {
        return this.isReported;
    }

    public final boolean isSenderReported() {
        return this.isSenderReported;
    }

    public final boolean isTemporary() {
        return this.isTemporary;
    }

    public final void setMentions(Mentions mentions) {
        this.mentions = mentions;
    }

    public final void setMentionsInfo(MentionsInfo mentionsInfo) {
        this.mentionsInfo = mentionsInfo;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setMessageInteraction(MessageInteraction messageInteraction) {
        this.messageInteraction = messageInteraction;
    }

    public final void setPinned(boolean z10) {
        this.isPinned = z10;
    }

    public final void setReported(boolean z10) {
        this.isReported = z10;
    }

    public final void setSenderReported(boolean z10) {
        this.isSenderReported = z10;
    }

    public final void setTemporary(boolean z10) {
        this.isTemporary = z10;
    }

    public final void setThreadInfo(ThreadInfo threadInfo) {
        this.threadInfo = threadInfo;
    }

    public final void setTotalLikes(int i10) {
        this.totalLikes = i10;
    }

    @NotNull
    public String toString() {
        String str = this.messageId;
        String str2 = this.message;
        String str3 = this.template;
        String str4 = this.senderId;
        String str5 = this.senderPicture;
        String str6 = this.senderGroupRole;
        String str7 = this.senderGlobalRole;
        String str8 = this.senderName;
        String str9 = this.groupId;
        String str10 = this.parentMessageId;
        ThreadInfo threadInfo = this.threadInfo;
        Long l10 = this.editedAt;
        Long l11 = this.clientTime;
        Long l12 = this.serverTime;
        long j10 = this.updatedAt;
        Media media = this.media;
        int i10 = this.totalLikes;
        boolean z10 = this.isTemporary;
        MessageInteraction messageInteraction = this.messageInteraction;
        boolean z11 = this.isPinned;
        Integer num = this.forwardDepth;
        String str11 = this.forwardSource;
        Mentions mentions = this.mentions;
        MentionsInfo mentionsInfo = this.mentionsInfo;
        boolean z12 = this.isReported;
        boolean z13 = this.isSenderReported;
        StringBuilder l13 = e.l("ChatMessage(messageId=", str, ", message=", str2, ", template=");
        e.v(l13, str3, ", senderId=", str4, ", senderPicture=");
        e.v(l13, str5, ", senderGroupRole=", str6, ", senderGlobalRole=");
        e.v(l13, str7, ", senderName=", str8, ", groupId=");
        e.v(l13, str9, ", parentMessageId=", str10, ", threadInfo=");
        l13.append(threadInfo);
        l13.append(", editedAt=");
        l13.append(l10);
        l13.append(", clientTime=");
        l13.append(l11);
        l13.append(", serverTime=");
        l13.append(l12);
        l13.append(", updatedAt=");
        l13.append(j10);
        l13.append(", media=");
        l13.append(media);
        l13.append(", totalLikes=");
        l13.append(i10);
        l13.append(", isTemporary=");
        l13.append(z10);
        l13.append(", messageInteraction=");
        l13.append(messageInteraction);
        l13.append(", isPinned=");
        l13.append(z11);
        l13.append(", forwardDepth=");
        l13.append(num);
        l13.append(", forwardSource=");
        l13.append(str11);
        l13.append(", mentions=");
        l13.append(mentions);
        l13.append(", mentionsInfo=");
        l13.append(mentionsInfo);
        l13.append(", isReported=");
        l13.append(z12);
        l13.append(", isSenderReported=");
        l13.append(z13);
        l13.append(")");
        return l13.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.messageId);
        parcel.writeString(this.message);
        parcel.writeString(this.template);
        parcel.writeString(this.senderId);
        parcel.writeString(this.senderPicture);
        parcel.writeString(this.senderGroupRole);
        parcel.writeString(this.senderGlobalRole);
        parcel.writeString(this.senderName);
        parcel.writeString(this.groupId);
        parcel.writeString(this.parentMessageId);
        ThreadInfo threadInfo = this.threadInfo;
        if (threadInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadInfo.writeToParcel(parcel, flags);
        }
        Long l10 = this.editedAt;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l10);
        }
        Long l11 = this.clientTime;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l11);
        }
        Long l12 = this.serverTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            a.r(parcel, 1, l12);
        }
        parcel.writeLong(this.updatedAt);
        Media media = this.media;
        if (media == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            media.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.totalLikes);
        parcel.writeInt(this.isTemporary ? 1 : 0);
        MessageInteraction messageInteraction = this.messageInteraction;
        if (messageInteraction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageInteraction.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isPinned ? 1 : 0);
        Integer num = this.forwardDepth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.forwardSource);
        Mentions mentions = this.mentions;
        if (mentions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mentions.writeToParcel(parcel, flags);
        }
        MentionsInfo mentionsInfo = this.mentionsInfo;
        if (mentionsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mentionsInfo.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isReported ? 1 : 0);
        parcel.writeInt(this.isSenderReported ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ChatMessage(java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, com.assetgro.stockgro.data.model.ThreadInfo r43, java.lang.Long r44, java.lang.Long r45, java.lang.Long r46, long r47, com.assetgro.stockgro.data.model.Media r49, int r50, boolean r51, com.assetgro.stockgro.data.model.MessageInteraction r52, boolean r53, java.lang.Integer r54, java.lang.String r55, com.assetgro.stockgro.data.model.Mentions r56, com.assetgro.stockgro.data.model.MentionsInfo r57, boolean r58, boolean r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.data.model.ChatMessage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.assetgro.stockgro.data.model.ThreadInfo, java.lang.Long, java.lang.Long, java.lang.Long, long, com.assetgro.stockgro.data.model.Media, int, boolean, com.assetgro.stockgro.data.model.MessageInteraction, boolean, java.lang.Integer, java.lang.String, com.assetgro.stockgro.data.model.Mentions, com.assetgro.stockgro.data.model.MentionsInfo, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
