package companylogic;

public class Post
{
    public enum PostType
    {
        Junior,
        Middle,
        Senior
    }

    private PostType postType = PostType.Junior;

    private String description = "простак какой-то";

    public Post() { }

    public Post(PostType postType, String description)
    {
        this.postType = postType;
        this.description = description;
    }

    public void set(Post post)
    {
        if(post == null) return;

        this.postType = post.postType;
        this.description = post.description;
    }

    @Override
    public String toString()
    {
        return "Post type: " + postType.toString() + ", description: " + description;
    }

    public PostType getPostType() { return postType; }
    public void setPostType(PostType postType) { this.postType = postType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
